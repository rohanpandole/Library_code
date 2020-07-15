import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestClass
{ 
	public static void main(String[] args) 
	{
		int doChoicel;
	  do {
		  try {
			  Scanner scan = new Scanner(System.in);

			  System.out.println("\n1: Book issued and return record (name|date)");
			  System.out.println("2: which student(id) issued book (stud_id|b_name)");
			  System.out.println("3: All in stock book ");//fix count
			  System.out.println("4: available book (name|count)");//fix-issued=available book(10-7=2)
			  System.out.println("5: Which book issued more time in single day");
			  System.out.println("6: all current issued book name");//imp
			  System.out.println("7: update record");
			  System.out.println("8: insert new record");
			  System.out.println("\n-----------Enter your choice----------\n");

			  int choice = scan.nextInt();
			  switch (choice)
			  {
				  case 1:
					  Class.forName("com.mysql.jdbc.Driver");
					  Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
					  String s1 = "select b_name,b_issue,b_return from book_issue_data";
					  Statement st1 = con1.createStatement();
					  ResultSet rs1 = st1.executeQuery(s1);
					  System.out.println("b_name \t b_issue \t b_return");
					  while (rs1.next()) {
						  System.out.println(rs1.getString("b_name") + "\t" + rs1.getDate("b_issue") + "\t" + rs1.getDate("b_return"));
					  }
					  con1.close();
					  break;

//*****************************************************************************************************************

				  case 2:
					  Class.forName("com.mysql.jdbc.Driver");
					  Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
					  String s2 = "select stud_id,b_name from book_issue_data where b_return is null";
					  Statement st2 = con2.createStatement();
					  ResultSet rs2 = st2.executeQuery(s2);
					  System.out.println("stud_id \t b_name");
					  while (rs2.next()) {
						  System.out.println(rs2.getInt("stud_id") + "-----------" + rs2.getString("b_name"));
					  }
					  con2.close();
					  break;

//*****************************************************************************************************************

				  case 3:
					  Class.forName("com.mysql.jdbc.Driver");
					  Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
					  String s3 = "select * from book_quantity";
					  Statement st3 = con3.createStatement();
					  ResultSet rs3 = st3.executeQuery(s3);

					  System.out.println("\n-----------------------------------------\nb_name ----------- b_quantity \n-----------------------------------------\n");
					  while (rs3.next()) {
						  System.out.println(rs3.getString("b_name") + "----------" + rs3.getInt("b_quantity"));
					  }
					  con3.close();
					  break;

//*******************************************************************************************************************


				  case 4:

					 int innerDoChoice;
					  do {
						  Scanner scan4 = new Scanner(System.in);

						  System.out.println("\n enter chioce of book\n");
						  System.out.println(" 1: os  2: database  3: tom   4: som  5: java  6: digital  7: big data  8: construction  9: hydrology  10: structures  11:  tunnel engineering\n");
						  int choice4 = scan4.nextInt();
						  try {
							  switch (choice4) {
								  case 1:
									  String s4 = "select a.b_quantity - count(b.b_name) as Available_Quantity from book_quantity a join book_issue_data b on a.b_name=b.b_name where b.b_return is null group by b.b_name having b.b_name='os'";
									  Class.forName("com.mysql.jdbc.Driver");
									  Connection con4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
									  Statement st4 = con4.createStatement();
									  ResultSet rs4 = st4.executeQuery(s4);
									  if (rs4.next())
									  {
										  System.out.println("\nAvailable os book quantity ");
										  System.out.println(rs4.getInt("Available_Quantity"));
									  }else
							  			{
								 			 System.out.println("\nBook is available");
							  			}
									  con4.close();
									  break;

								  case 2:

									  String s41 = "select a.b_quantity - count(b.b_name) as Available_Quantity from book_quantity a join book_issue_data b on a.b_name=b.b_name where b.b_return is null group by b.b_name having b.b_name='database'";
									  Class.forName("com.mysql.jdbc.Driver");
									  Connection con41 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
									  Statement st41 = con41.createStatement();
									  ResultSet rs41 = st41.executeQuery(s41);
									  if (rs41.next())
									  {
										  System.out.println("\nAvailable som book quantity");
										  System.out.println(rs41.getInt("Available_Quantity"));

									  }else
									  {
										  System.out.println("\nBook is available");
									  }
									  con41.close();

									  break;


								  case 3:

									  String s42 = "select a.b_quantity - count(b.b_name) as Available_Quantity from book_quantity a join book_issue_data b on a.b_name=b.b_name where b.b_return is null group by b.b_name having b.b_name='tom'";
									  Class.forName("com.mysql.jdbc.Driver");
									  Connection con42 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
									  Statement st42 = con42.createStatement();
									  ResultSet rs42 = st42.executeQuery(s42);
									  if (rs42.next())
									  {
										  System.out.println("\nAvailable tom book quantity ");
										  System.out.println(rs42.getInt("Available_Quantity"));
									  }else
									  {
									  	System.out.println("\nBook is available");
									  }
									  con42.close();

									  break;


								  case 4:

									  String s43 = "select a.b_quantity - count(b.b_name) as Available_Quantity from book_quantity a join book_issue_data b on a.b_name=b.b_name where b.b_return is null group by b.b_name having b.b_name='som'";
									  Class.forName("com.mysql.jdbc.Driver");
									  Connection con43 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
									  Statement st43 = con43.createStatement();
									  ResultSet rs43 = st43.executeQuery(s43);
									  if (rs43.next())
									  {
										  System.out.println("\nAvailable som book quantity ");
										  System.out.println(rs43.getInt("Available_Quantity"));
									  }else
									  {
										  System.out.println("\nBook is available");
									  }

									  con43.close();

									  break;


								  case 5:

									  String s44 = "select a.b_quantity - count(b.b_name) as Available_Quantity from book_quantity a join book_issue_data b on a.b_name=b.b_name where b.b_return is null group by b.b_name having b.b_name='java'";
									  Class.forName("com.mysql.jdbc.Driver");
									  Connection con44 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
									  Statement st44 = con44.createStatement();
									  ResultSet rs44 = st44.executeQuery(s44);
									  if(rs44.next())
									  {
										  System.out.println("\nAvailable java book quantity ");
										  System.out.println(rs44.getInt("Available_Quantity"));
									  }else
									  {
										  System.out.println("\nBook is available");
									  }

									  con44.close();

									  break;

								  case 6:

									  String s45 = "select a.b_quantity - count(b.b_name) as Available_Quantity from book_quantity a join book_issue_data b on a.b_name=b.b_name where b.b_return is null group by b.b_name having b.b_name='digital'";
									  Class.forName("com.mysql.jdbc.Driver");
									  Connection con45 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
									  Statement st45 = con45.createStatement();
									  ResultSet rs45 = st45.executeQuery(s45);
									  if (rs45.next())
									  {
										  System.out.println("\nAvailable digital book quantity ");
										  System.out.println(rs45.getInt("Available_Quantity"));
									  }else
									  {
										  System.out.println("\nBook is available");
									  }


									  con45.close();
									  break;

								  case 7:

									  String s46 = "select a.b_quantity - count(b.b_name) as Available_Quantity from book_quantity a join book_issue_data b on a.b_name=b.b_name where b.b_return is null group by b.b_name having b.b_name='big data'";
									  Class.forName("com.mysql.jdbc.Driver");
									  Connection con46 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
									  Statement st46 = con46.createStatement();
									  ResultSet rs46 = st46.executeQuery(s46);
									  if (rs46.next())
									  {
										  System.out.println("\nAvailable big data book quantity ");
										  System.out.println(rs46.getInt("Available_Quantity"));
									  }else
									  {
										  System.out.println("\nBook is available");
									  }
									  con46.close();
									  break;

								  case 8:

									  String s47 = "select a.b_quantity - count(b.b_name) as Available_Quantity from book_quantity a join book_issue_data b on a.b_name=b.b_name where b.b_return is null group by b.b_name having b.b_name='constructures'";
									  Class.forName("com.mysql.jdbc.Driver");
									  Connection con47 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
									  Statement st47 = con47.createStatement();
									  ResultSet rs47 = st47.executeQuery(s47);
									  if (rs47.next())
									  {
										  System.out.println("\nAvailable constructure book quantity ");
										  System.out.println(rs47.getInt("Available_Quantity"));
									  }else
									  {
										  System.out.println("\nBook is available");
									  }
									  con47.close();
									  break;

								  case 9:

									  String s48 = "select a.b_quantity - count(b.b_name) as Available_Quantity from book_quantity a join book_issue_data b on a.b_name=b.b_name where b.b_return is null group by b.b_name having b.b_name='hydrology'";
									  Class.forName("com.mysql.jdbc.Driver");
									  Connection con48 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
									  Statement st48 = con48.createStatement();
									  ResultSet rs48 = st48.executeQuery(s48);
									  if (rs48.next())
									  {
										  System.out.println("\nAvailable hydrology book quantity ");
										  System.out.println(rs48.getInt("Available_Quantity"));
									  }else
									  {
										  System.out.println("\nBook is available");
									  }
									  con48.close();
									  break;

								  case 10:

									  String s49 = "select a.b_quantity - count(b.b_name) as Available_Quantity from book_quantity a join book_issue_data b on a.b_name=b.b_name where b.b_return is null group by b.b_name having b.b_name='structures'";
									  Class.forName("com.mysql.jdbc.Driver");
									  Connection con49 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
									  Statement st49 = con49.createStatement();
									  ResultSet rs49 = st49.executeQuery(s49);
									  if (rs49.next())
									  {
										  System.out.println("\nAvailable structures book quantity ");
										  System.out.println(rs49.getInt("Available_Quantity"));
									  }else
									  {
										  System.out.println("\nBook is available");
									  }
									  con49.close();
									  break;

								  case 11:

									  String s410 = "select a.b_quantity - count(b.b_name) as Available_Quantity from book_quantity a join book_issue_data b on a.b_name=b.b_name where b.b_return is null group by b.b_name having b.b_name='tunnel engineering'";
									  Class.forName("com.mysql.jdbc.Driver");
									  Connection con410 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
									  Statement st410 = con410.createStatement();
									  ResultSet rs410 = st410.executeQuery(s410);
									  if (rs410.next())
									  {
										  System.out.println("\nAvailable tunnel engineering book quantity ");
										  System.out.println(rs410.getInt("Available_Quantity"));
									  }else
									  {
										  System.out.println("\nBook is available");
									  }
									  con410.close();
									  break;
							  }
						  } catch (Exception e)
						  {
							  e.printStackTrace();
						  }
						  System.out.println("\nDo you want to continue to check available book" +
								  				" press 1 or not then press 0 \n");
						  Scanner sc=new Scanner(System.in);
						  innerDoChoice=sc.nextInt();
					  }while (innerDoChoice==1);

					  break;
//***********************************************************************************************************************

				  case 5:
					  Scanner scan55 = new Scanner(System.in);
					  Class.forName("com.mysql.jdbc.Driver");
					  Connection con55 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
					  String s55 = "select b_name,b_issue,count(*) from book_issue_data group by b_name,b_issue  having b_issue=?";
					  PreparedStatement ps55 = con55.prepareStatement(s55);
					  System.out.println("\n enter date to find issued book more time in single day");
					  int get1 = scan55.nextInt();
					  ps55.setInt(1, get1);

					  ResultSet rs55 = ps55.executeQuery();
					  System.out.println("\n b_name \t b_issue\t count(*)");
					  while (rs55.next()) {
						  System.out.println(rs55.getString("b_name") + "\t    " + rs55.getDate("b_issue") + "\t    " + rs55.getInt("count(*)"));
					  }
					  con55.close();
					  break;
//*********************************************************************************************************************

				  case 6:
					  Class.forName("com.mysql.jdbc.Driver");
					  Connection con66 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
					  Statement st66 = con66.createStatement();
					  String s66 = "select b_name,count(b_issue)as count from book_issue_data where b_return is null group by b_name";  ///need changes
					  ResultSet rs66 = st66.executeQuery(s66);
					  while (rs66.next()) {
						  System.out.println(rs66.getString("b_name") + "---------" + rs66.getInt("count"));
					  }
					  con66.close();
					  break;

//*****************************************************************************************************************

				  case 7:
					  Class.forName("com.mysql.jdbc.Driver");
					  Connection con7 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");

					  Statement st7 = con7.createStatement();
					  String s7 = "select * from book_issue_data";
					  ResultSet rs7 = st7.executeQuery(s7);

					  System.out.println("sr_no \t stud_id \t" + "b_name \t" + "b_issue \t" + "b_return");

					  while (rs7.next()) {
						  System.out.println(rs7.getInt("sr_no") + "\t" + rs7.getInt("stud_id") + "\t" + rs7.getString("b_name") + "\t" + rs7.getDate("b_issue") + "\t" + rs7.getDate("b_return"));
					  }

					  System.out.println("update all record via consol");

					  String s77 = "update book_issue_data set b_name=?,b_issue=?,b_return=?,stud_id=? where sr_no=?";

					  PreparedStatement ps = con7.prepareStatement(s77);

					  Scanner scan1 = new Scanner(System.in);


					  System.out.println("\n enter book name");
					  String r71 = scan1.nextLine();

					  System.out.println("\n enter book issued date");
					  int r72 = scan1.nextInt();

					  System.out.println("\n enter book return date");
					  int r73 = scan1.nextInt();

					  System.out.println("\n enter student id ");
					  int r74 = scan1.nextInt();

					  System.out.println("\n enter sr_no to update");
					  int r75 = scan1.nextInt();


					  ps.setString(1, r71);
					  ps.setInt(2, r72);
					  ps.setInt(3, r73);
					  ps.setInt(4, r74);
					  ps.setInt(5, r75);

					  ps.executeUpdate();//for update table

					  String s777 = "select * from book_issue_data";
					  ResultSet rs777 = ps.executeQuery(s777);

					  System.out.println("sr_no \t stud_id \t b_name \t b_issue \t b_return");

					  while (rs777.next()) {
						  System.out.println(rs777.getInt("sr_no") + "\t" + rs777.getInt("stud_id") + "\t" + rs777.getString("b_name") + "\t" + rs777.getDate("b_issue") + "\t" + rs777.getDate("b_return"));
					  }


					  con7.close();
					  break;
				  default:
					  System.out.println(" wrong choice");
					  break;

//*******************************************************************************************************************

				  case 8:
					  Class.forName("com.mysql.jdbc.Driver");
					  Connection con8 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_mini_project", "root", "");
					  String s8 = "insert into book_issue_data values(?,?,?,?,?)";

					  PreparedStatement ps8 = con8.prepareStatement(s8);
					  Scanner scan8 = new Scanner(System.in);

					  System.out.println("\n enter sr_no as a 0");
					  int s18 = scan8.nextInt();
					  System.out.println("\n enter student id");
					  int s28 = scan8.nextInt();
					  System.out.println("\n enter book name");
					  String s38 = scan.next();
					  System.out.println("\n enter book issue date");
					  int s48 = scan8.nextInt();
					  System.out.println("\n enter book return date");
					  int s58 = scan.nextInt();

					  ps8.setInt(1, s18);
					  ps8.setInt(2, s28);
					  ps8.setString(3, s38);
					  ps8.setInt(4, s48);
					  ps8.setInt(5, s58);

					  ps8.executeUpdate();

					  String s88 = "select * from book_issue_data";
					  ResultSet rs8 = ps8.executeQuery(s88);
					  System.out.println("sr_no \t stud_id \t b_name \t b_issued \t b_return	");
					  while (rs8.next()) {
						  System.out.println(rs8.getInt("sr_no") + "\t" + rs8.getInt("stud_id") + "\t" + rs8.getString("b_name") + "\t" + rs8.getDate("b_issue") + "\t" + rs8.getDate("b_return"));
					  }
					  con8.close();
					  break;


			  }  								//  Switch closed
		  } catch (Exception e)
		  {
			  e.printStackTrace();
		  }      								// try closed

		  System.out.println("\n Do you want to continue Main Menu  press 1 or not then press 0 \n");
		  Scanner sc=new Scanner(System.in);
		  doChoicel=sc.nextInt();
	  }while (doChoicel==1); 								// do while loop closed
	}
}

/*   updated schema

+----------------------------------+
| Tables_in_JDBC_project_newBranch |
+----------------------------------+java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
| tbl_book                         |
| tbl_book_issue_return            |
| tbl_log                          |
| tbl_student                      |
+----------------------------------+


 tbl_book;
+------------+-------------+------+-----+---------+----------------+
| Field      | Type        | Null | Key | Default | Extra          |
+------------+-------------+------+-----+---------+----------------+
| b_id       | int(3)      | NO   | PRI | NULL    | auto_increment |
| b_name     | varchar(28) | YES  |     | NULL    |                |
| b_author   | varchar(28) | YES  |     | NULL    |                |
| b_dept     | varchar(20) | YES  |     | NULL    |                |
| b_prise    | float       | NO   |     | NULL    |                |
| b_quantity | int(11)     | NO   |     | NULL    |                |
+------------+-------------+------+-----+---------+----------------+

 tbl_book_issue_return;
+---------------+-------------+------+-----+---------+-------+
| Field         | Type        | Null | Key | Default | Extra |
+---------------+-------------+------+-----+---------+-------+
| b_id          | int(11)     | NO   |     | NULL    |       |
| b_name        | varchar(20) | YES  |     | NULL    |       |
| b_author      | varchar(20) | YES  |     | NULL    |       |
| b_dept        | varchar(20) | YES  |     | NULL    |       |
| b_issue_date  | date        | NO   |     | NULL    |       |
| b_return_date | date        | YES  |     | NULL    |       |
| b_status      | int(11)     | NO   |     | NULL    |       |
+---------------+-------------+------+-----+---------+-------+

 tbl_log;
+---------------+-------------+------+-----+---------+-------+
| Field         | Type        | Null | Key | Default | Extra |
+---------------+-------------+------+-----+---------+-------+
| b_id          | int(11)     | NO   |     | NULL    |       |
| b_name        | varchar(20) | YES  |     | NULL    |       |
| b_dept        | varchar(20) | YES  |     | NULL    |       |
| b_isse_date   | date        | YES  |     | NULL    |       |
| b_return_date | date        | YES  |     | NULL    |       |
| b_author      | varchar(20) | YES  |     | NULL    |       |
+---------------+-------------+------+-----+---------+-------+

 tbl_student;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| s_id   | int(11)     | NO   |     | NULL    |       |
| s_name | varchar(20) | YES  |     | NULL    |       |
| S_dept | varchar(20) | NO   |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+


old schema    -------------------------------------------------------------------------------------------------------

+-----------------------------+
| Tables_in_JDBC_mini_project |
+-----------------------------+
| book_issue_data             |
| book_quantity               |
| student                     |
+-----------------------------+

 book_issue_data;
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| sr_no    | double      | NO   | PRI | NULL    | auto_increment |
| stud_id  | int(11)     | NO   |     | NULL    |                |
| b_name   | varchar(20) | NO   | MUL | NULL    |                |
| b_issue  | date        | YES  |     | NULL    |                |
| b_return | date        | YES  |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+

 book_quantity;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| b_name     | varchar(20) | NO   | PRI | NULL    |       |
| b_quantity | int(11)     | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
 
 student;
+------------------------+-------------+------+-----+---------+-------+
| Field                  | Type        | Null | Key | Default | Extra |
+------------------------+-------------+------+-----+---------+-------+
| stud_id                | int(11)     | NO   | PRI | 0       |       |
| stud_name              | varchar(20) | YES  |     | NULL    |       |
| dept                   | varchar(20) | NO   |     | NULL    |       |
| stud_issued_book_count | int(11)     | YES  |     | NULL    |       |
+------------------------+-------------+------+-----+---------+-------+






*/
