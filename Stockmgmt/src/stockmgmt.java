
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class stockmgmt {
    public static void main(String args[])
    {
        String myurl = "jdbc:mysql://localhost/stockmgmt";
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from addemployee";   //select query is implemented,addemployee is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        ResultSet myres = myst.executeQuery();
       
        if(myres.next())
        {
         login obj = new login();
         obj.setVisible(true);
        }
        else
        {
        Addadmin obj = new Addadmin();
         obj.setVisible(true);
        }
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null,"Error Occured : " + e.getMessage());   
        }
        finally
        {
         myconn.close();   //to close the connection  
        }
        }
        catch(Exception e)
                {
                JOptionPane.showMessageDialog(null,"Error Occured : " + e.getMessage());    
                }
    }

    
}
