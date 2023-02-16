package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_ConnByTry 
{
	public static void main(String[] args)
	{
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");

		Connection con = DriverManager.getConnection("jdbc:MySQL://Localhost:3306/dell","root","Root@11");
		System.out.println("Connection is Build");
		
		Statement st=con.createStatement();
		
	    ResultSet RS=st.executeQuery("Select * from perinfo;");
				while  (RS.next())
				{
					System.out.println(RS.getInt(1)+"   "+RS.getString(2)+" "+
				RS.getString(3)+"   "+RS.getString(6));
				}
				
				while(true)
				{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter ID: ");
		int ID=sc.nextInt();
		
		System.out.println("Enter Name:");
		String Name=sc.next();
		
		Scanner ss=new Scanner (System.in);
		System.out.println("Enter Surname:");
		String SR=ss.nextLine();
		
		System.out.println("Enter City:");
		String City=ss.nextLine();
		
		System.out.println("Enter Email:");
		String Email=ss.nextLine();
		
		System.out.println("Enter ContactNo");
		String Con=ss.nextLine();
		
		//st.executeUpdate("Insert into perinfo Values ('"+ID+"','"+Name+"','"+SR+"','"+City+"','"+Email+"','"+Con+"')");
		
		String sql=String.format("Insert into perinfo values (%d,'%s','%s','%s','%s','%s')",ID,Name,SR,City,Email,Con);
		st.execute(sql);
		System.out.println("Done");
		
			System.out.println("Do you want to continue[Yes/No]");
			String Select=ss.nextLine();
			if(Select.equalsIgnoreCase("No"))
			{
				System.out.println("Thank you for using the Apllication");
				break;
			}
		}	
	}
		catch(Exception e)
		{
			
		}
		
	}
	
}
