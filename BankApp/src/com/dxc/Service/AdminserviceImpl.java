package com.dxc.Service;
import com.dxc.Dao.IAdminDao;
import com.dxc.pojos.*;


//import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

import com.dxc.Dao.AdminDaoImpl;

public class AdminserviceImpl implements IAdminservice {
IAdminDao dao=new AdminDaoImpl();

@Override
public boolean authenticate(String admin_id,String password) {
	return dao.authenticate(admin_id,password);
}
@Override
public void addusers(usersdetails us) {
	dao.addusers(us);
}
@Override
public usersdetails findusers(int accno) {
	return dao.findusers(accno);
}
@Override
public boolean searchUsers(int accno) {
	return dao.searchUsers(accno);

}
@Override
public void updateusers(usersdetails us)
{
	dao.updateusers(us);
}
@Override
public double getbalance(int accno) {
	return dao.getbalance(accno);
}
@Override
public void removeuser(int accno) {
	dao.removeusers(accno);
}
@Override
public List<usersdetails> getAllUsers() {
	return dao.getAllUsers();
}
}
