package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CatalogueManager{
	private String pizza, constituents, large, medium, xlarge, jumbo;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String M_CONN_STRING = "jdbc:mysql://localhost/pizza";
	public ArrayList readCatalogue(){
    ArrayList<Catalogue> catalogue = new ArrayList<Catalogue>();
    Statement stmt=null;
    ResultSet rs=null;
    try {

        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection(M_CONN_STRING, USERNAME, PASSWORD);

        stmt = conn.createStatement();

        if (stmt.execute("select * from catalogue")) {
            rs = stmt.getResultSet();
        } else {
            System.err.println("select failed");
        }
        while (rs.next()) {
            pizza = rs.getString("Pizza");
            constituents = rs.getString("constituents");
            medium = rs.getString("Medium");
            large = rs.getString("Large");
            xlarge = rs.getString("Extra_Large");
            jumbo = rs.getString("Jumbo");
            Catalogue cat= new Catalogue(pizza, constituents,medium,large,xlarge,jumbo);
            catalogue.add(cat);
        }

    } catch (Exception ex) {
        System.err.println("Database Read Error");
        System.err.println(ex);
    }

    return catalogue;
}

}