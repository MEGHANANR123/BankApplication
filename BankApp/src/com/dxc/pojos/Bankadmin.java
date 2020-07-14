package com.dxc.pojos;

public class Bankadmin {
	private String admin_id;
	private String password;
	
	public Bankadmin() {
		
	}

	public Bankadmin(String admin_id, String password) {
		super();
		this.admin_id = admin_id;
		this.password = password;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
