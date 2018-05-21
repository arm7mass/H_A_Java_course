package db;

import company_sql.Tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class go {

    private static String url = "";
    private static final String dbName = "company";
    private static Connection con;

    /* Methode to prpare the url to connect with the DataBase */
    private static void setURL() {
        url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&characterEncoding=UTF-8";
    }

    /* methode to work with con */
    private static void setConnection() {

        try {
            setURL();
            con = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }
    }

    /* method to check the user name and password */
    public static Boolean checkUserAndPass(String username, String password) {

        try {
            setConnection();
            Statement stmt = con.createStatement();
            // sql statment : select from users where username ='username' and pass ='password' ;
            String strCheck = "select * from users where username ='" + username + "'and pass ='" + password + "'";
            stmt.execute(strCheck);
            while (stmt.getResultSet().next()) {
                con.close();
                return true;
            }
            con.close();

        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }
        return false;

    }
}
