package com;

import java.util.List;

import com.bean.Form;
import com.bean.NewUser;

public interface NewUserDao {
	public int addNewUserDao(NewUser nu);
	public int addform(Form f);
	public List<NewUser> selectuser(NewUser nu);
	public int updateuser(NewUser nu);
	
	
}
