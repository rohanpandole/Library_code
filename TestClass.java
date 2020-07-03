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

//*******************************************************************************************************************

			
		case 4:
			
			Scanner scan4=new Scanner(System.in);
			
			System.out.println("\n enter chioce of book");
			System.out.println(" 1: os  2: database  3: tom   4: som  5: java  6: digital  7: big data  8: construction  9: hydrology  10: structures  11:  tunnel engineering " );
			int choice4=scan4.nextInt();
			try
			{
			switch(choice4)
			{
			case 1:
			 String s4="select a.b_quantity - count(D.b_name)as diff from book111 D join book11 a on D.b_name=a.b_name where D.b_name='os' group by D.b_name,b_quantity";
			 Connection con4=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
				Statement st4=con4.createStatement();
				ResultSet rs4=st4.executeQuery(s4);
				while(rs4.next())
				{	System.out.println("available os book quantity ");
					System.out.println(rs4.getInt("diff"));
				}
				con4.close();
			break;
			
			case 2:
			
				String s41="select a.b_quantity - count(D.b_name)as diff from book111 D join book11 a on D.b_name=a.b_name where D.b_name='database' group by D.b_name,b_quantity";
				 Connection con41=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
					Statement st41=con41.createStatement();
					ResultSet rs41=st41.executeQuery(s41);
					while(rs41.next())
					{	System.out.println("available database book quantity ");
						System.out.println(rs41.getInt("diff"));
					}
					con41.close();
				
			break;
			
			
			
			case 3:
				
				String s42="select a.b_quantity - count(D.b_name)as diff from book111 D join book11 a on D.b_name=a.b_name where D.b_name='tom' group by D.b_name,b_quantity";
				 Connection con42=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
					Statement st42=con42.createStatement();
					ResultSet rs42=st42.executeQuery(s42);
					while(rs42.next())
					{	System.out.println("available tom book quantity ");
						System.out.println(rs42.getInt("diff"));
					}
					con42.close();
				
			break;
			
			
			case 4:
				
				String s43="select a.b_quantity - count(D.b_name)as diff from book111 D join book11 a on D.b_name=a.b_name where D.b_name='som' group by D.b_name,b_quantity";
				 Connection con43=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
					Statement st43=con43.createStatement();
					ResultSet rs43=st43.executeQuery(s43);
					while(rs43.next())
					{	System.out.println("available som book quantity ");
						System.out.println(rs43.getInt("diff"));
					}
					con43.close();
				
			break;
			
			
			case 5:
				
				String s44="select a.b_quantity - count(D.b_name)as diff from book111 D join book11 a on D.b_name=a.b_name where D.b_name='java' group by D.b_name,b_quantity";
				 Connection con44=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
					Statement st44=con44.createStatement();
					ResultSet rs44=st44.executeQuery(s44);
					while(rs44.next())
					{	System.out.println("available java book quantity ");
						System.out.println(rs44.getInt("diff"));
					}
					con44.close();
				
			break;
			
			case 6:
				
				String s45="select a.b_quantity - count(D.b_name)as diff from book111 D join book11 a on D.b_name=a.b_name where D.b_name='digital' group by D.b_name,b_quantity";
				 Connection con45=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
					Statement st45=con45.createStatement();
					ResultSet rs45=st45.executeQuery(s45);
					while(rs45.next())
					{	System.out.println("available digital book quantity ");
						System.out.println(rs45.getInt("diff"));
					}
					con45.close();
				
			case 7:
				
				String s46="select a.b_quantity - count(D.b_name)as diff from book111 D join book11 a on D.b_name=a.b_name where D.b_name='big data' group by D.b_name,b_quantity";
				 Connection con46=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
					Statement st46=con46.createStatement();
					ResultSet rs46=st46.executeQuery(s46);
					while(rs46.next())
					{	System.out.println("available big data book quantity ");
						System.out.println(rs46.getInt("diff"));
					}
					con46.close();
				
			case 8:
				
				String s47="select a.b_quantity - count(D.b_name)as diff from book111 D join book11 a on D.b_name=a.b_name where D.b_name='constructures' group by D.b_name,b_quantity";
				 Connection con47=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
					Statement st47=con47.createStatement();
					ResultSet rs47=st47.executeQuery(s47);
					while(rs47.next())
					{	System.out.println("available constructure book quantity ");
						System.out.println(rs47.getInt("diff"));
					}
					con47.close();
					
			case 9:
				
				String s48="select a.b_quantity - count(D.b_name)as diff from book111 D join book11 a on D.b_name=a.b_name where D.b_name='hydrology' group by D.b_name,b_quantity";
				 Connection con48=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
					Statement st48=con48.createStatement();
					ResultSet rs48=st48.executeQuery(s48);
					while(rs48.next())
					{	System.out.println("available hydrology book quantity ");
						System.out.println(rs48.getInt("diff"));
					}
					con48.close();
					
			case 10:
				
				String s49="select a.b_quantity - count(D.b_name)as diff from book111 D join book11 a on D.b_name=a.b_name where D.b_name='structures' group by D.b_name,b_quantity";
				 Connection con49=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
					Statement st49=con49.createStatement();
					ResultSet rs49=st49.executeQuery(s49);
					while(rs49.next())
					{	System.out.println("available structures book quantity ");
						System.out.println(rs49.getInt("diff"));
					}
					con49.close();
					
			case 11:
				
				String s410="select a.b_quantity - count(D.b_name)as diff from book111 D join book11 a on D.b_name=a.b_name where D.b_name='tunnel engineering' group by D.b_name,b_quantity";
				 Connection con410=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
					Statement st410=con410.createStatement();
					ResultSet rs410=st410.executeQuery(s410);
					while(rs410.next())
					{	System.out.println("available tunnel engineering book quantity ");
						System.out.println(rs410.getInt("diff"));
					}
					con410.close();
			break;
			}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			break;
//***********************************************************************************************************************

		case 5:
			Scanner scan55=new Scanner(System.in);
			Connection con55=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
			String s55="select b_name,b_issue,count(*) from book111 group by b_name,b_issue  having b_issue=?";
			PreparedStatement ps55=con55.prepareStatement(s55);
			System.out.println("\n enter date to find issued book more time in single day");
			int get1=scan55.nextInt();
			ps55.setInt(1, get1);
			//ps55.executeUpdate();
			
			
			//Statement st55=con55.createStatement();
			
			ResultSet rs55=ps55.executeQuery();
			System.out.println("\n b_name \t b_issue\t count(*)");
			while(rs55.next())
			{
				System.out.println(rs55.getString("b_name")+"\t    "+rs55.getDate("b_issue")+"\t    "+rs55.getInt("count(*)"));
			}
			con55.close();
			break;
//*********************************************************************************************************************

 case 6:
			
			Connection con66=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "hr");
			Statement st66=con66.createStatement();
			String s66="select b_name,count(b_issue) from book_issue_data where b_issue is not null AND b_return is null group by b_name";  ///need changes
			ResultSet rs66=st66.executeQuery(s66);
			while(rs66.next())
			{
				System.out.println(rs66.getString("b_name"));
			}
			con66.close();
			break;	

//*****************************************************************************************************************

		case 7:
			Connection con7=DriverManager.getConnection("jdbc:mysql://localhost/student?zeroDateTimeBehavior=convertToNull", "root", "hr");

			Statement st7=con7.createStatement();
			String s7="select * from book111";
			ResultSet rs7=st7.executeQuery(s7);

			System.out.println("sr_no \t stud_id \t"+"b_name \t"+"b_issue \t"+"b_return");

			while(rs7.next())
			{	
				System.out.println(rs7.getInt("sr_no")+"\t"+rs7.getInt("stud_id")+"\t"+rs7.getString("b_name")+"\t"+rs7.getDate("b_issue")+"\t"+rs7.getDate("b_return"));
			}

			System.out.println("update all record via consol");

			String s77="update book111 set b_name=?,b_issue=?,b_return=?,stud_id=? where sr_no=?";

			PreparedStatement ps=con7.prepareStatement(s77);
			
			Scanner scan1=new Scanner(System.in);
			
			
			System.out.println("\n enter book name");
			String r71=scan1.nextLine();
			
			System.out.println("\n enter book issued date");
			int r72=scan1.nextInt();
			
			System.out.println("\n enter book return date");
			int r73=scan1.nextInt();
			
			System.out.println("\n enter student id ");
			int r74=scan1.nextInt();
			
			System.out.println("\n enter sr_no to update");
			int r75=scan1.nextInt();
			
			
			ps.setString(1,r71);
			ps.setInt(2,r72);
			ps.setInt(3,r73);
			ps.setInt(4, r74);
			ps.setInt(5, r75);
			
			ps.executeUpdate();//for update execution
		 
			Statement st777=con7.createStatement();

			String s777="select * from book111";

			ResultSet rs777=st777.executeQuery(s777);

			System.out.println("sr_no \t stud_id \t b_name \t b_issue \t b_return");

			while(rs777.next())
			{	
				System.out.println(rs777.getInt("sr_no")+"\t"+rs777.getInt("stud_id")+"\t"+rs777.getString("b_name")+"\t"+rs777.getDate("b_issue")+"\t"+rs777.getDate("b_return"));
			}			
		
			
			con7.close();
			break;
		default:
			System.out.println(" wrong choice");
			break;
		}
//*******************************************************************************************************************

		case 8:
			
			Connection con8=DriverManager.getConnection("jdbc:mysql://localhost/student?zeroDateTimeBehavior=convertToNull", "root", "hr");
			String s8="insert into book111 values(?,?,?,?,?)";
			
			PreparedStatement ps8=con8.prepareStatement(s8);
			Scanner scan8=new Scanner(System.in);
			
			System.out.println("\n enter sr_no as a 0");
			int s18=scan8.nextInt();
			System.out.println("\n enter student id");
			int s28=scan8.nextInt();
			System.out.println("\n enter book name");
			String s38=scan.next();
			System.out.println("\n enter book issue date");
			int s48=scan8.nextInt();
			System.out.println("\n enter book return date");
			int s58=scan.nextInt();
			
			ps8.setInt(1, s18);
			ps8.setInt(2,s28);
			ps8.setString(3, s38);
			ps8.setInt(4, s48);
			ps8.setInt(5, s58);
			
			ps8.executeUpdate();
			
			String s88="select * from book111";
			ResultSet rs8=ps8.executeQuery(s88);
			System.out.println("sr_no \t stud_id \t b_name \t b_issued \t b_return	");
			while(rs8.next())
			{
				System.out.println(rs8.getInt("sr_no")+"\t"+rs8.getInt("stud_id")+"\t"+rs8.getString("b_name")+"\t"+rs8.getDate("b_issue")+"\t"+rs8.getDate("b_return"));
			}
			con8.close();
			break;
			

		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
