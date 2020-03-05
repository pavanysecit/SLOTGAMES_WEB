package stepDefinition_GoldenCrown;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

public class sqlConnection {


	 public static void main(String[] args) throws SQLException, ClassNotFoundException {	
			String dbURL = "jdbc:sqlserver://10.200.10.40:1433;instanceName=MSSQLSERVER;databaseName=SlotGameDBRelease";
			String username = "demoslot";
	        String password = "Demo@3212";
	        //Load MS SQL JDBC Driver
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        //Creating connection to the database
	        Connection con = DriverManager.getConnection(dbURL,username,password);
	        //Creating statement object
	    	Statement st = con.createStatement();
	    	//String selectquery = "select Payout,SymbolId from SlotGame.PayTable where GameId=18";
	    	//System.out.println("selectquery" +selectquery);
	        //Executing the SQL Query and store the results in ResultSet
	    	ResultSet rs = st.executeQuery("select Payout,SymbolId from SlotGame.PayTable where GameId=18");
	    	System.out.println("rs" +rs);
	    	//While loop to iterate through all data and print results
//	    	while (rs.next()) {
//	    		System.out.println(rs.getString("Payout")+"!"+ rs.getString("SymbolId") +"!"+ rs.getString("GameId"));
//	    	}
	        //Closing DB Connection
	    	con.close();
			}
		}