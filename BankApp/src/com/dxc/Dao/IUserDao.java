package com.dxc.Dao;

import java.util.List;


import com.dxc.pojos.usersdetails;
import com.dxc.pojos.Transaction;

public interface IUserDao {
	
	public boolean authenticate(int user_id,String password);
	
	public boolean depositeAmount(int accno,double acbalance);

	public int getAccno(int userid, String password);

	public double checkbalance(int accno);

	public List<Transaction> TransactionDetails(int accno);

	 public void PasswordChange(int accno,String password);

	public boolean checkpassword(int accno, String password);

	public boolean transfer(int accno, int taccno, double amount);

	public boolean WithdrawAmount(int accno, double acbalance);
}