package com.chandra.pms.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	public static Connection con = null;

	public static Connection getConnection() {
		try {
			File path = new File("G:\\fullstack5am\\JdbcProductManagement\\src\\main\\resources\\db.properties");
			FileInputStream fis = new FileInputStream(path);
			Properties p = new Properties();
			p.load(fis);
			// Load the driver
			Class.forName(p.getProperty("driver"));
			// establish the connection
			con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
