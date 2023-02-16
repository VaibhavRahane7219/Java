package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class JDBC_Conn 
{
	public static void main(String[] args) throws Exception
	{
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver is loaded");

Connection con = DriverManager.getConnection("jdbc:MySQL://Localhost:3306/dell","root","Root@11");
System.out.println("Connection is Build");

Statement st=con.createStatement();

//st.execute("Create Database DELL");
//System.out.println("Database Created");/

//st.execute("create table perinfo(Id int,Name varchar(50),City varchar(50),ContactNo int)");
//System.out.println("Table is created");

//st.executeUpdate("Insert into perinfo Values (16,'Mahesh','Dere','Nasik','maheshd@gmail.com',9821600606);");
//System.out.println("Data insert successfully");
	
//  st.executeUpdate("Alter table perinfo add Email varchar (30) after City;");
//  System.out.println("y");

//	st.executeUpdate("Update perinfo Set Surname='Chavan', Email='prashantfficial290@gmail.com' Where ID=13;");
//	System.out.println("Y");

//	st.executeUpdate("Delete from perinfo where Id=16;");
//	System.out.println("Y");



	}

}
