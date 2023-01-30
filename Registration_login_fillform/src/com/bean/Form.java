package com.bean;

public class Form {
String f_name;
String l_name;
String email;
int mobile_no;
String gender;
String age;
String dob;
long subject;
long resume;
public Form() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Form [f_name=" + f_name + ", l_name=" + l_name + ", email=" + email + ", mobile_no=" + mobile_no
			+ ", gender=" + gender + ", age=" + age + ", dob=" + dob + ", subject=" + subject + ", resume=" + resume
			+ "]";
}
public String getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name = f_name;
}
public String getL_name() {
	return l_name;
}
public void setL_name(String l_name) {
	this.l_name = l_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getMobile_no() {
	return mobile_no;
}
public void setMobile_no(int mobile_no) {
	this.mobile_no = mobile_no;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public long getSubject() {
	return subject;
}
public void setSubject(long subject) {
	this.subject = subject;
}
public long getResume() {
	return resume;
}
public void setResume(long resume) {
	this.resume = resume;
}

}
