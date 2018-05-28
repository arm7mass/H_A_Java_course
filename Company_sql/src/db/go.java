package db;

import company_sql.Tools;
import company_sql.Tools.Table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

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

    //Method That recieve Statement query and return a Table with the statment Inside 
    public static Table getTableData(String statement) {
        Tools t = new Tools();
        try {
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(statement);
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
            Table table = t.new Table(c);
            while (rs.next()) {
                Object row[] = new Object[c];
                for (int i = 0; i < c; i++) {
                    row[i] = rs.getString(i + 1);
                }
                table.addNewRow(row);
            }
            con.close();
            return table;

        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
            return t.new Table(0);

        }
    }

    //Create Method that its input will be table name , column name , Jcombo Box 
    //it will fill combo Box through column 
    public static void fillCombo(String tableName, String columnName, JComboBox combo) {
        try {
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            String strSelect = "select" + columnName + "from" + tableName;
            rs = stmt.executeQuery(strSelect);
            rs.last();    // put record set on the last row to count the number of rows
            int c = rs.getRow();  // get the number of rows 
            rs.beforeFirst(); //go back to starting points
            String values[] = new String[c];
            int i = 0;
            while (rs.next()) { // go through column row by row 
                values[i] = rs.getString(1);
                i++;
            }
            con.close();
            combo.setModel(new DefaultComboBoxModel(values));// fill combo with the matrix values 

        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());

        }

    }

}
