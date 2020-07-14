package com.dxc.Service;

import java.util.List;

import com.dxc.pojos.Transaction;

public interface IUserService {

	public boolean authenticate(int user_id, String password);
	
   boolean depositeAmount(int accno,double acbalance);
	
	int getAccno(int userid,String password);
	
	boolean WithdrawAmount(int accno,double acbalance);
	
	double checkbalance(int accno);
	
	List<Transaction> TransactionDetails(int accno);
	
    void PasswordChange(int accno,String password);
	
	boolean checkpassword(int accno,String password);
	
	boolean transfer(int accno,int taccno,double tamount);

}
