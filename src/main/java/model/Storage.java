package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;

public class Storage
{
	public static String id, name, phoneNum, location, type, qty,size,addtop, remtop,salespoint,timestamp;
	
	

	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String M_CONN_STRING = "jdbc:mysql://localhost/pizza";
	private static PreparedStatement pmt;
	

	public  void storeUserInfo(User u)   
	{
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			GregorianCalendar timestamp = new GregorianCalendar();
			timestamp.getTime().toGMTString();
			String sql = "INSERT INTO orderplacement " ;
			sql =  sql + "(name, phone, location,type,  size,  quantity, added_toppings, removed_toppings, salespoint, timestamp) " ;
			sql = sql + " values (?, ?, ?, ?, ?,?,?,?,?,?)" ;
			
			Connection connection = DriverManager.getConnection(M_CONN_STRING, USERNAME, PASSWORD);
			pmt = connection.prepareStatement(sql);
			pmt.setString(1, u.getName());
			pmt.setString(2, u.getPhone());
			pmt.setString(3, u.getLocation());
			pmt.setString(4, u.getType());
			pmt.setString(5, u.getSize());
			pmt.setString(6, u.getQuantity());
			pmt.setString(7, u.getAddtop());
			pmt.setString(8, u.getRemtop());
			pmt.setString(9, u.getSalesPoint());
			pmt.setString(10, u.getTimeStamp());
			pmt.executeUpdate();
			connection.close();
			
		}
		catch (SQLException e ) 
		{
			
			e.printStackTrace();
		}catch (ClassNotFoundException ee)
		{
			ee.printStackTrace();
		}
		
	}

	/*public void readOrders(){
		Statement stmt=null;
		ResultSet rs=null;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection(M_CONN_STRING, USERNAME, PASSWORD);

			stmt = conn.createStatement();

			if (stmt.execute("select * from orderplacement")) {
				rs = stmt.getResultSet();
			} else {
				System.err.println("select failed");
			}
			while (rs.next()) {
				id = rs.getString("id");
				name = rs.getString("name");
				phoneNum = rs.getString("phone");
				location = rs.getString("location");
				type = rs.getString("type");
				size = rs.getString("size");
				qty = rs.getString("quantity");
				addtop = rs.getString("added_toppings");
				remtop = rs.getString("removed-toppings");
				salespoint = rs.getString("salespoint");
				timestamp = rs.getString("timestamp");
             	 
}

} catch (Exception ex) {
	System.err.println("Database Read Error");
	System.err.println(ex);
}


}*/



}