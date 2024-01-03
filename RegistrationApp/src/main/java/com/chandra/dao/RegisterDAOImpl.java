package com.chandra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chandra.db.DBUtil;
import com.chandra.model.Users;

public class RegisterDAOImpl implements RegisterDAO {

	Connection con = DBUtil.getConnection();
	PreparedStatement ps = null;
	ResultSet rs = null;
	int result = 0;
	@Override
	public int register(Users user) {
		try {
			ps = con.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?)");
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getPassWord());
			ps.setString(4, user.getType());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public String login(Users user) {
		String msg = null;
		try {
			ps = con.prepareStatement("SELECT * FROM USERS WHERE USERNAME=? AND PASSWORD=?");
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassWord());
			rs = ps.executeQuery();
			if(rs.next()) {
				msg = "Success";
			}else {
				msg = "failed";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
		
	}
	@Override
	public String forgot(String userName, String type) {
		String password = null;
		try {
			ps = con.prepareStatement("SELECT * FROM USERS WHERE USERNAME=? AND TYPE=?");
			ps.setString(1, userName);
			ps.setString(2, type);
			rs = ps.executeQuery();
			if(rs.next()) {
				password = rs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;
	}

}
