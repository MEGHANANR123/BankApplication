package com.dxc.Dao;
import java.util.List;

import com.dxc.pojos.*;
public interface IAdminDao {
	
public boolean authenticate(String admin_id,String password);

public void addusers(usersdetails us);

public usersdetails findusers(int accno);
public boolean searchUsers(int accno);
public void updateusers(usersdetails us);
public double getbalance(int accno);
public void removeusers(int accno);
public List<usersdetails> getAllUsers();


}
