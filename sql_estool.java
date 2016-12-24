
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author project
 */
public class sql_estool {
    Connection cin=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\project\\Documents\\NetBeansProjects\\cocomoIIES\\dbestool.sqlite");
            return con;
            
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
}
