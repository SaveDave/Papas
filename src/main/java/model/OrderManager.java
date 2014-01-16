package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Order;

public class OrderManager{
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String M_CONN_STRING = "jdbc:mysql://localhost/pizza";
    private static PreparedStatement pmt;
    private static String id, name, phoneNum, location, type, qty,size,addtop,remtop,salespoint,timestamp;
    private static double price=0.0;

    public ArrayList readOrders(){
     Statement stmt=null;
     ResultSet rs=null;
     ArrayList<Order> list = new ArrayList<Order>();

     try {

        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection(M_CONN_STRING, USERNAME, PASSWORD);

        stmt = conn.createStatement();

        if (stmt.execute("SELECT * FROM orderplacement ORDER BY id DESC")) {
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
           salespoint = rs.getString("salespoint");
           addtop = rs.getString("added_toppings");
           remtop = rs.getString("removed_toppings");
           timestamp = rs.getString("timestamp");
           Order or= new Order(id,name,phoneNum,location,type,qty,size,addtop,remtop,salespoint,timestamp,price);
           list.add(or);
       }

   } catch (Exception ex) {
    System.err.println("Database Read Error");
    System.err.println(ex);
}

return list;
}


}