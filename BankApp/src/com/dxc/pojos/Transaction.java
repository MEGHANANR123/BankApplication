package com.dxc.pojos;

public class Transaction
{
	private int accno;
	private String transaction;
	private double transferbal;
	public Transaction()
	{
		
	}
	public Transaction(int accno, String transaction, double transferbal) {
		super();
		this.accno = accno;
		this.transaction = transaction;
		this.transferbal = transferbal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	public double getTransferbal() {
		return transferbal;
	}
	public void setTransferbal(double transferbal) {
		this.transferbal = transferbal;
	}
	
}