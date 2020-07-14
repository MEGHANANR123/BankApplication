package com.dxc.pojos;

public class usersdetails {
	private int accno;
	private String uname;
    private double acbalance;
    private int userid;
    private String password;
public usersdetails() {
	
}

public usersdetails(int accno, String uname, double acbalance,int userid,String password) {
	super();
	this.accno = accno;
	this.uname = uname;
	this.acbalance = acbalance;
	this.userid = userid;
	this.password = password;
}

public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getAccno() {
	return accno;
}

public void setAccno(int accno) {
	this.accno = accno;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public double getAcbalance() {
	return acbalance;
}

public void setAcbalance(double acbalance) {
	this.acbalance = acbalance;
}

}
