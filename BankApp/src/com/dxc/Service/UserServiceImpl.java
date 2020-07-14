package com.dxc.Service;

import java.util.List;

import com.dxc.Dao.UserDaoImpl;
import com.dxc.Dao.IUserDao;
import com.dxc.pojos.Transaction;
import com.dxc.pojos.usersdetails;


public class UserServiceImpl implements IUserService {

	IUserDao dao=new UserDaoImpl();
	
	@Override
	public boolean authenticate(int user_id,String password)
	{
		return dao.authenticate(user_id, password);
	}
	
	public boolean depositeAmount(int accno,double acbalance)
	{
		return dao.depositeAmount(accno,acbalance);
	}

	@Override
	public int getAccno(int userid, String password) {
		
		return dao.getAccno(userid,password);
	}

	@Override
	public boolean WithdrawAmount(int accno, double acbalance) {
	
		return dao.WithdrawAmount(accno,acbalance);
	}

	@Override
	public double checkbalance(int accno) {
		
		return dao.checkbalance(accno);
	}

	@Override
	public List<Transaction> TransactionDetails(int accno) {
	 
		return dao.TransactionDetails(accno);
		
	}

	 @Override
	 public void PasswordChange(int accno,String password) {
	
		dao.PasswordChange(accno,password);
		
	}

	@Override
	public boolean checkpassword(int accno, String password) {
		
		return dao.checkpassword(accno,password);
	}

	@Override
	public boolean transfer(int accno, int taccno, double tamount) {
		
		return dao.transfer(accno,taccno,tamount);
	}

	

	
	}

	


