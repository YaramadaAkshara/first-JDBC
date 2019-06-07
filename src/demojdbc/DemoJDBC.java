
package demojdbc;
import java.sql.*;
public class DemoJDBC {

    
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            String Query="Select * from student where rollno=4";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo?autoReconnect=true&useSSL=false", "root", "root");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(Query);
        rs.next();
        String sname=rs.getString(2);
        System.out.println(sname);
        con.close();
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
    }
    
}
