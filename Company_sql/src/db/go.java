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

    // method to check the user name and password 
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

    // Method to recieve query and excute it in database (insert , update , delete
    public static boolean runNonQuery(String sqlStatement) {
        try {
            setConnection();
            Statement stmt = con.createStatement();
            stmt.execute(sqlStatement);
            con.close();
            return true;
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
            return false;

        }

    }

    // method to search within the data base for large number and 1 to it 
    //the method require table name and numeric column name with primary key 
    public static String getAutoNumber(String tableName, String columnName) {
        try {
            setConnection();
            Statement stmt = con.createStatement();
            String strAuto = "select max (" + columnName + ")+1 as autonum " + "from " + tableName;
            stmt.executeQuery(strAuto);
            String num = "";
            while (stmt.getResultSet().next()) {
                num = stmt.getResultSet().getString("atonum");
            }
            con.close();
            if (num == null || "".equals(num)) {
                return "1";
            } else {
                return num;
            }
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
            return "0";
        }
    }
}
