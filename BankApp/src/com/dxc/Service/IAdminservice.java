package com.dxc.Service;
import com.dxc.pojos.Bankadmin;
import com.dxc.pojos.usersdetails;
import java.util.List;
public interface IAdminservice {
	public boolean authenticate(String admin_id,String password);
	
	public void addusers(usersdetails us);
	
	public usersdetails findusers(int accno);
	
	public boolean searchUsers(int accno);
	public void updateusers(usersdetails us);
	public double getbalance(int accno);
	public void removeuser(int accno);
	public List<usersdetails> getAllUsers();
	}

