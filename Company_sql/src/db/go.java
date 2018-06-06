package db;

import company_sql.Tools;
import company_sql.Tools.Table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
            // sql select statment : select from users where username ='username' and pass ='password' ;
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
            String strAuto = "select max(" + columnName + ")+1 as autonum " + "from " + tableName;
            stmt.executeQuery(strAuto);
            String num = "";
            while (stmt.getResultSet().next()) {
                num = stmt.getResultSet().getString("autonum");
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

    //Method That recieve select Statement query and return a Table with the statment Inside 
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
// moooooooooooooost important Method **************************************
    // Method recieves select statement or table name and fill the Jtable 

    public static void fillToJTable(String TableNameOrSelectStatement, JTable table) {
        try {
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            String SPart = TableNameOrSelectStatement.substring(0, 7).toLowerCase(); // cut only first 7 part of the variable the change it to lower case 
            String strSelect;
            if ("select ".equals(SPart)) {
                strSelect = TableNameOrSelectStatement; // select statement was sent 
            } else {
                strSelect = "select * from " + TableNameOrSelectStatement; //table name was sent 
            }
            rs = stmt.executeQuery(strSelect);
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount(); // number of table column 
            DefaultTableModel model = (DefaultTableModel) table.getModel(); // creating the table
            Vector row = new Vector();// used to fill the table 
            model.setRowCount(0);// remove all row from the table 
            while (rs.next()) { // while loop according to row number .next()
                row = new Vector(c); // new row according to column number 
                for (int i = 1; i <= c; i++) { // check column one by one and store its value in the row 
                    row.add(rs.getString(i)); // for this we start from one 
                }
                model.addRow(row);
            }// after ending while loop all rows will be filled 
            if (table.getColumnCount() != c) {
                Tools.msgBox("Jtable Columns count is not equal to query column count \n Jtable count is :" + table.getColumnCount() + "\n Query column count is : " + c);

            }
            con.close();
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());

        }
    }

}
