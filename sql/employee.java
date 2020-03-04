package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class employee {
	public static void main(String args[])		throws SQLException	 {
	
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection	 con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/amal","root","root");
			System.out.println("connected");
			
			Scanner sc= new Scanner(System.in);
			String st=sc.nextLine();
		switch(st)
		{
		case "U":
		
			int a=sc.nextInt();
			int id=sc.nextInt();
			
			PreparedStatement ps=con.prepareStatement("Update emp1 set esal=esal+"+a+" where id = ?");
			ps.setInt(1,id);
			
			ps.executeUpdate();
			break;
			
		case "R":
			int i=sc.nextInt();
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("Select * from emp1 where id="+i+"");
			
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3));
			}
			
		}
		
		}
		
		
		catch(Exception e) {
			
		}
		
			
	}

}
		
		
