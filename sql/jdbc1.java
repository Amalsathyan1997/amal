package sql;


import java.sql.*;

class jdbc1 {
	 public static void main(String args[])		throws SQLException	 {
		 Connection con=null;
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/amal","root","root");
			System.out.println("connected");
			
			
			PreparedStatement ps=con.prepareStatement("insert into dept values(?,?)");
			ps.setInt(1,56);
			ps.setString(2,"amalfgh");
			ps.executeUpdate();
			ps.close();
			ps=con.prepareStatement("select* from dept");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("dno"));
				System.out.println(rs.getString("dname"));
		
	}
			
					
}
    catch(SQLException |ClassNotFoundException se)
	{
		System.out.println(se);
	}
		
		finally {
		con.setAutoCommit(false);
		}
			}

      }
