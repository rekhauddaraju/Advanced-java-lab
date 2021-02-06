package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBDataAcess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// load the jdbc driver-4 into application for mysql.
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection.
			// DriverManager.getConnection(connectionURL, username,password)
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1","root","");
			
			
			//1.
			/*String query="select * from emp where sal >?";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, "10000");
			
			ResultSet rs=psmt.executeQuery();*/
			
			
			//2.
			/*String query="insert into emp values(?,?,?,?)";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, "1657");
			psmt.setString(2, "sarath");
			psmt.setString(3, "8675");
			psmt.setString(4, "admin");
			
			int rows=psmt.executeUpdate();
			System.out.println(rows+" row(s) are updated.");
			Statement stmt= con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from emp");*/
			
			
			
			//3.
			String query="update emp set sal=? where empno=?";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, "15000000");
			psmt.setString(2, "1");
			
			int rows=psmt.executeUpdate();
			System.out.println(rows+" row(s) are updated.");
			Statement stmt= con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from emp");
			
			// Statement object creation.
			
			//Statement stmt= con.createStatement();
			
			// execution of sql statement. output is table which is represented as resultset in application.
			//ResultSet rs=stmt.executeQuery("select * from emp");
			
			// retrieve the data from resultset
			System.out.println("empno\tename\tsal\tdept");
			
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			
			con.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}