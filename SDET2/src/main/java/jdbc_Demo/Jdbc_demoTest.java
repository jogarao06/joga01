//
//  package jdbc_Demo;
//  
//  import java.sql.Connection; import java.sql.DriverManager; import
//  java.sql.ResultSet; import java.sql.SQLException; import java.sql.Statement;
//  
//  import org.testng.annotations.Test;
//  
//  import com.mysql.cj.jdbc.Driver;
//  
//  public class Jdbc_demoTest {
//  
//  @Test
//  
//  public void jdbcTest() throws SQLException { Driver dref = new Driver();
//  DriverManager.registerDriver(dref);
//  
//  Connection con =
//  DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root",
//  "root"); Statement statemnt = con.createStatement();
//  
//  ResultSet result = statemnt.executeQuery("select * from students_info");
//  while (result.next()) { System.out.println(result.getInt(1) + "" +
//  result.getString(2) + "" + result.getString(3));
//  
//  } con.close(); }
//  
//  @Test(enabled = false) public void jdbcTestupdate() throws SQLException {
//  Driver dref = new Driver(); DriverManager.registerDriver(dref);
//  
//  Connection con =
//  DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root",
//  "root"); Statement statemnt = con.createStatement();
//  
//  int result = statemnt.executeUpdate(
//  "insert into students_info (regno, firstname, middlename, lastname) values('6', 'rangaaram06','raniagowda07', 'aaah1');"
//  ); if (result == 1) { System.out.println("Project sucessfully Created"); }
//  
//  else { System.out.println("query failed");
//  
//  }
//  
//  con.close(); System.out.println("connection Closed"); }
//  
//  }
// 