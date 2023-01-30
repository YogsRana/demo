package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bean.Form;
import com.bean.NewUser;

public class NewUserDaoImpl implements NewUserDao{
@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void JdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}

	@Override
	public int addNewUserDao(NewUser nu) {
		String sql="insert into rlogin values(?,?)";
		int i=jdbcTemplate.update(sql, new Object[] {nu.getUsername(),nu.getPassword()});
		return i;
	}

	@Override
	public int addform(Form f) {
	String sql="insert into Form values(?,?,?,?,?,?,?,?,?)";
	int i1=jdbcTemplate.update(sql, new Object[] {f.getF_name(),f.getL_name(),f.getEmail(),
	f.getMobile_no(),f.getGender(),f.getAge(),f.getDob(),f.getSubject(),f.getResume()});
	return i1;
	}

	@Override
	public List<NewUser> selectuser(NewUser nu) {
		String sql="select * from rlogin where username=? and password=?";	
		List<NewUser> ulist=jdbcTemplate.query(sql,  new Object[] {nu.getUsername(),nu.getPassword()}, new RowMapper<NewUser>() {

			@Override
			public NewUser mapRow(ResultSet arg0, int arg1) throws SQLException {
				NewUser nu=new NewUser();
				nu.setUsername(arg0.getString(1));
				nu.setPassword(arg0.getString(2));
				return nu;
			}
		});
		return ulist;
	}
	
@Override
	public int updateuser(NewUser nu) {
		String sql="update rlogin set password='"+nu.getPassword()+"' where username='"+nu.getUsername()+"'";
		return jdbcTemplate.update(sql);
	}

}
	