package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class element {


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
		
			String a=sc.next();
			int atwt=sc.nextInt();
			
			PreparedStatement ps=con.prepareStatement("Update emp1 set sym=? where atwt = ?");
			ps.setString(1,a);
			ps.setInt(2,atwt);
			
			ps.executeUpdate();
			break;
			
		case "R":
			int i=sc.nextInt();
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("Select * from chem1 where atwt="+i+"");
			
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
			}
			
			
			
		case "D":
			int id1=sc.nextInt();
			PreparedStatement ps1=con.prepareStatement("Delete  from chem1 where atwt=?");
			ps1.setInt(1,id1);
		    ps1.executeUpdate();
			
		System.out.println("deleted ....");
			
			
		}
		
		}
		
		
		catch(Exception e) {
			
		}
		
			
	}

}
		
		
