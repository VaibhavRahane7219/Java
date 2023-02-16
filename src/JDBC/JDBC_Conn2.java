package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class JDBC_Conn2 
{
	public static void main(String[] args) throws Exception
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver is Loaded");
	
	Connection com= DriverManager.getConnection("jdbc:MySQL://Localhost:3306/jdbc","root","Root@11");
	System.out.println("Connection Build");
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter AppID:");
	int AppID=sc.nextInt();
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Name:");
	String Name=s.nextLine();
	
	Scanner c=new Scanner(System.in);
	System.out.println("Enter Skill:");
	String Skill=c.nextLine();
	
	Scanner sca=new Scanner(System.in);
	System.out.println("Enter Education");
	String Edu=sca.nextLine();
	
	String sql= String.format("Insert into pi values(%d,'%s','%s','%s')" , AppID,Name,Skill,Edu);
	PreparedStatement PST=com.prepareStatement(sql);
	//Statement xy= com.createStatement();
		
	//xy.execute("Create database JDBC");
	//System.out.println("Database Created");
	
	//xy.execute("Create table AI(ApplID int,Name varchar(50),Skill varchar(30),Education varchar(20))");
	//System.out.println("Table is Created");
	
	//xy.executeUpdate("Insert into ai values(108,'Mrunal','Fullstack Java','BE')");
	//System.out.println("Data inserted");
	
	PST.executeUpdate();
	PST.close();
	String sql1=String.format("Insert into ai values(%d,'%s','%s','%s')" , AppID,Name,Skill,Edu);
	
	PST=com.prepareStatement(sql1);
	PST.executeUpdate();
	PST.close();
	
	PreparedStatement PS=com.prepareStatement(sql1);
	ResultSet RS=PS.executeQuery("Select * from ai");
		while (RS.next())
		{
			System.out.println(RS.getInt(1)+" "+RS.getString(2)+" "+RS.getString(3)+" "+RS.getString(4));
		}
		
	}

}
