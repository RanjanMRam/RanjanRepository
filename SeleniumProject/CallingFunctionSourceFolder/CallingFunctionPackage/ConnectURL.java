package CallingFunctionPackage;

import java.sql.Connection;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectURL {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
    	
    	//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
    	
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BAJDEMO;integratedSecurity=true");
        Statement s1 = con.createStatement();
        ResultSet rs = s1.executeQuery("select * from dbo.UFTFlightReservationDatabase;");
       while(rs.next())
       {
    	   System.out.println(rs.getString("p_Username")+" "+rs.getString("p_Password")+" "+rs.getString("p_FromCity")+" "+rs.getString("p_ToCity")+" "+rs.getString("p_DateOfTravel")+" "+rs.getString("p_TicketType")+" "+rs.getString("p_NoOfTickets")+" "+rs.getString("p_Passenger"));
       }
        
    	
    }
}

