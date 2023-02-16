package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn
{
	public static void main(String[] args) throws Exception
	{
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver is loaded");

String URL="jdbc:MySQL://Localhost:3306/vaibhav";
String USR="root";
String Pass="Root@11";
Connection con = DriverManager.getConnection(URL,USR,Pass);
System.out.println("Connection is Build");

//Statement st = con.createStatement();
//
//st.execute("Create Database ExJDBC");
//System.out.println("Dtabase Created");


	}

}



