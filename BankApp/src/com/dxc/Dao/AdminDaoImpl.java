package com.dxc.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dxc.pojos.usersdetails;

public class AdminDaoImpl implements IAdminDao {
private static Connection conn;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded...");
			
		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/BANKAPP", "root", "u@H6t5I!");
			System.out.println("connected to database....");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public boolean authenticate(String admin_id,String password) {
	try {
	PreparedStatement pstmt=conn.prepareStatement("select adminid,password from admin where adminid=? and password=?");
	pstmt.setString(1, admin_id);
	pstmt.setString(2,password);
	ResultSet rs=pstmt.executeQuery();
	if(rs.next()) {
		return true;
	}
	else {
		return false;
	}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return false;
}
	@Override
	public void addusers(usersdetails us)
	{
		try {
			PreparedStatement pstmt=conn.prepareStatement("insert into users values(?,?,?,?,?)");
			pstmt.setInt(1, us.getAccno());
			pstmt.setString(2,  us.getUname());
			pstmt.setDouble(3, us.getAcbalance());
			pstmt.setInt(4, us.getUserid());
			pstmt.setString(5, us.getPassword());
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public usersdetails findusers(int accno)
		{
			try {
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery("select * from users");
				while(rs.next())
				{
					if(accno==rs.getInt(1))
					{
						return new usersdetails(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4),rs.getString(5));
					}
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}
@Override
public boolean searchUsers(int accno)
	{
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from users");
			while(rs.next())
			{
				if(accno==rs.getInt(1))
				{
					return true;
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

@Override
public void updateusers(usersdetails us)
{
	try {
		PreparedStatement pstmt=conn.prepareStatement("update users set uname=?,acbalance=? ,userid=? ,password=? where accno=?");
		pstmt.setString(1,  us.getUname());
		pstmt.setDouble(2, us.getAcbalance());
		pstmt.setInt(3, us.getUserid());
		pstmt.setString(4, us.getPassword());
		pstmt.setInt(5, us.getAccno());
		pstmt.executeUpdate();
		
	}catch(Exception e) {
		e.printStackTrace();
	}

}
@Override
public double getbalance(int accno)
	{
	double Acbalance=0;
	Statement stmt;
		try {
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from users");
			while(rs.next())
			{
				if(accno==rs.getInt(1))
				{
				Acbalance=rs.getDouble(3);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return Acbalance;
	}
@Override
public void removeusers(int accno)
{
	try {
		PreparedStatement pstmt=conn.prepareStatement("delete from users where accno=?");
		pstmt.setInt(1, accno);
        pstmt.executeUpdate();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
@Override
public List<usersdetails> getAllUsers()
{
	List<usersdetails> list=new ArrayList<>();
	try {
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from users");
		while(rs.next())
		{
			list.add(new usersdetails(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4),rs.getString(5)));
		}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return list;
	}
}