package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Catalogue {
	private String pizza, constituents, large, medium, xlarge, jumbo;

	public Catalogue(String pizza, String constituents, String medium, String large, String xlarge, String jumbo){
		this.pizza=pizza;
		this.constituents=constituents;
		this.medium=medium;
		this.large=large;
		this.xlarge=xlarge;
		this.jumbo=jumbo;
	}

	public String getPizza(){
		return pizza;
	}
	public String getConstituents(){
		return constituents;
	}
	public String getLarge(){
		return large;
	}
	public String getMedium(){
		return medium;
	}
	public String getXlarge(){
		return xlarge;
	}
	public String getJumbo(){
		return jumbo;
	}

}
