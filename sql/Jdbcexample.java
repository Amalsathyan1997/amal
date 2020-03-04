package sql;
import java.sql.*;

public class Jdbcexample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int i=3;
		String name="Dileep";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amal","root","root");
		PreparedStatement pt=con.prepareStatement("insert into Amployee values(?,?)");
		pt.setInt(1,i);
		pt.setString(2,name);
		int j=pt.executeUpdate();
		System.out.println(" the row has been updated rows affected"+j);
		ResultSet rs=pt.executeQuery("select * from Amployee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+rs.getString(2));
		}
		con.close();
		pt.close();
	}
}
