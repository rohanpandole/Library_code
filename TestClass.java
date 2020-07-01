package jdbc;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
public class TestClass 
{ 
	public static void main(String[] args) 
	{
		try	
		{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1: Book issued and return record (name|date)");
		System.out.println("2: which student(id) issued book (stud_id|b_name)");
		System.out.println("3: All in stock book ");//fix count
		System.out.println("4: available book (name|count)");//fix-issued=available book(10-7=2)
		System.out.println("5: Which book issued more time in single day");
		System.out.println("6: all current issued book name");//imp
		System.out.println("7: update record");
		System.out.println("8: insert new record");
		System.out.println("\n-----------Enter your choice----------\n");
		
		int choice=scan.nextInt();
		switch (choice)
		{
		case 1:
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/student?zeroDateTimeBehavior=convertToNull", "root", "hr"); 
			String s1="select b_name,b_issue,b_return from book111";
			Statement st1=con1.createStatement();
			ResultSet rs1=st1.executeQuery(s1);
			System.out.println("b_name \t b_issue \t b_return");
			while(rs1.next())
			{
				System.out.println(rs1.getString("b_name")+"\t"+rs1.getDate("b_issue")+"\t"+rs1.getDate("b_return"));
			}
			con1.close();
			break;

//*****************************************************************************************************************

		case 2:
			
			Connection con2=DriverManager.getConnection("jdbc:mysql://localhost/student?zeroDateTimeBehavior=convertToNull", "root", "hr");
			String s2="select stud_id,b_name from book111";
			Statement st2=con2.createStatement();
			ResultSet rs2=st2.executeQuery(s2);
			System.out.println("stud_id \t b_name");
			while(rs2.next())
			{
				System.out.println(rs2.getInt("stud_id")+"\t"+rs2.getString("b_name"));
			}
			con2.close();
			break;

//*****************************************************************************************************************
			
		case 3:
			Connection con3=DriverManager.getConnection("jdbc:mysql://localhost/student?zeroDateTimeBehavior=convertToNull", "root", "hr");
			String s3="select * from book11";
			Statement st3=con3.createStatement();
			ResultSet rs3=st3.executeQuery(s3);
			System.out.println("b_name \t b_quantity");
			while(rs3.next())
			{
				System.out.println(rs3.getString("b_name")+"\t"+rs3.getInt("b_quantity"));
			}
			con3.close();
			break;
		default:
			System.out.println(" wrong choice");
			break;
		}
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
