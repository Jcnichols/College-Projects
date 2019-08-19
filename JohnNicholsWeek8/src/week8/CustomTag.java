package week8;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomTag extends TagSupport{
	static final String USER = "student1";
	static final String PASS = "pass";
	private MyBean bean;
	
	public void doTag() throws JspException, IOException {
		try {
			 System.out.println("Connecting to database.");
			 DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
		     System.out.println("Driver Registered.");
		     
		     //Connect to the URL
		     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@academic3.bellevue.edu:1521:cistap", USER, PASS);
		     System.out.println("Established connection.");
		     //Execute Insert statement
		     Statement insertStatement = con.createStatement();
		     insertStatement.executeUpdate("INSERT INTO ADDRESS " + "(NAME,ADDRESS,CITY)" + "VALUES (" + bean.getMyNameDAta() + "," + bean.getMyAddressData() + "," + bean.getMyCityData() + ")");

		     // Execute a SELECT statement
		     Statement selectStatment = con.createStatement();
		     ResultSet rs = selectStatment.executeQuery("SELECT * FROM ADDRESS");
		     
		  	}
			catch(Exception e) {
				System.out.println("Exception while connecting to the database: " + e);
			}

	}

	public MyBean getBean() {
		return bean;
	}

	public void setBean(MyBean bean) {
		this.bean = bean;
	}
	
}
