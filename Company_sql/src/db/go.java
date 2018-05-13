
package db;

import company_sql.Tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class go {
    private static String url = "";
    private static final String dbName = "company";
    private static Connection con ;
    /* Methode to prpare the url to connect with the DataBase */
    private static void setURL(){
        url = "jdbc:mysql://localhost:3306/"+dbName+"?useUnicode=true&characterEncoding=UTF-8";
    }
    /* methode to work with con */
    private static void setConnection (){
        
        try {
            setURL();
            con=DriverManager.getConnection(url,"root" , "");
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }
    }
}
