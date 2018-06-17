package company_sql;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tools {

    // Static Class MsgBox Method
    public static void msgBox(String Message) {
        JOptionPane.showMessageDialog(null, Message);
    }
    // Static class confirm Method 
    public static Boolean confirmMsg(String message){
        int msgC = JOptionPane.showConfirmDialog(null, message);
        if (msgC==JOptionPane.YES_OPTION){ // the user press on yes button 
            return true ;
        }else{
            return false ;
        }
    }

    //Static Class Create Folder Method
    public static void createFolder(String Foldername, String path) {
        File f = new File(path + "/" + Foldername);
        f.mkdir();

    }

    //Static Class Create Folder Method
    public static void createFolder(String Foldername) {
        File f = new File(Foldername);
        f.mkdir();

    }

    // Static Class Open New Form Method
    public static void openForm(JFrame form) {

        try {
            form.setLocationRelativeTo(null);
            Image img = ImageIO.read(Tools.class.getResource("image.jpg"));
            form.setIconImage(img);
            form.setDefaultCloseOperation(2);
            form.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Static Java Clear J Text Field Method
    public static void ClearText(Container form) {
        for (Component c : form.getComponents()) {
            if (c instanceof JTextField) {
                JTextField txt = (JTextField) c;
                txt.setText("");
            } else if (c instanceof Container) {
                ClearText((Container) c);
            }
        }

    }

    //Static Create Empty File Method
    public static void CreateEmptyFile(String FileName) {

        File f = new File(FileName + ".txt");
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Static Create Empty Files
    public static void CreateEmptyFile(String FileName[]) {
        for (String str : FileName) {
            Tools.CreateEmptyFile(str);
        }
    }

    // Static Class Create Data txt File Method
    public static void CreateFile(String FileName, Object MyData[]) {
        try {
            PrintWriter p = new PrintWriter(FileName + ".txt");
            for (Object obj : MyData) {
                p.println(obj);

            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Static Class Create Data txt Files Method
    public static void CreateFiles(String FileNames[], Object AllData[][]) {
        for (int x = 0; x < FileNames.length; x++) {
            CreateFile(FileNames[x], AllData[x]);
        }
    }

    //Static Class Input Box Method
    public static Object InputBox(String title) {
        Object myobj = JOptionPane.showInputDialog(title);
        return myobj;
    }

    //Get Number From String Method
    public static String GetNumber(String text) {
        String val = "";
        for (char c : text.toCharArray()) {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                val += c;
            }
        }
        return val;
    }

    //Get Number Or (integer number) From String Method
    public static int GetIntNumber(String text) {
        String val = "";
        for (char c : text.toCharArray()) {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                val += c;
            }
        }
        return Integer.parseInt(val);
    }

    //Static remove Number Method
    public static String RemoveNumber(String text) {
        String val = "";
        for (char c : text.toCharArray()) {
            if (!(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')) {
                val += c;
            }
        }
        return val;
    }

    // static Print Screen method and save it to file 
    public static void PrintScreen(String ImageName) {
        try {
            Robot r = new Robot();
            Rectangle re = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r.createScreenCapture(re);
            ImageIO.write(img, "jpg", new File(ImageName + ".jpg"));
        } catch (AWTException | HeadlessException | IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // static print screen method and save to file with minimize the form 
    public static void PrintScreen1(String ImageName2, JFrame form) {
        form.setState(1);//minimize the form 
        try {
            Robot r = new Robot();
            Rectangle re = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r.createScreenCapture(re);
            ImageIO.write(img, "jpg", new File(ImageName2 + ".jpg"));
        } catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.setState(0);//maximize the form 
    }

    public class Table {

        //Attributes 
        public int columns;
        public Object[][] Items;

        // Constructor 
        public Table(int columns) {
            this.columns = columns;
            Items = new Object[0][columns];
        }

        // Method to add new row 
        public void addNewRow(Object row[]) {
            Object TempItems[][] = Items;    // transfer the old Items from main variable  to temporary variable
            Items = new Object[Items.length + 1][columns];   // increase the main variable with additional one item 
            for (int x = 0; x < TempItems.length; x++) {     // return the previouse Items from the Temporary variable to main variable 
                Items[x] = TempItems[x];
            }
            Items[Items.length - 1] = row;  // here we add the new row to the array  
        }

        // method to print the Two Dimension array 
        public void PrintItems() {
            for (Object objs[] : Items) {
                for (Object obj : objs) {
                    System.out.print(obj + " ; ");
                }
                System.out.println();
            }
        }

        // method to edit the two dimension array eliments
        public void editRow(int rowIndex, int columnIndex, Object newData) {
            Items[rowIndex][columnIndex] = newData;
        }

        // method to delete Row from Two dimnesional Array 
        public void DeleteRow(int RowIndex) {
            Object TempItem[][] = Items;
            Items = new Object[Items.length - 1][columns];
            int y = 0;
            for (int x = 0; x < TempItem.length; x++) {
                if (x != RowIndex) {
                    Items[y] = TempItem[x];
                    y++;
                }
            }
        }

        // method to return value 
        public Object getValue(int RowIndex, int columnIndex) {
            return Items[RowIndex][columnIndex];
        }

        public Object[] getRow(int RowIndex) {
            return Items[RowIndex];
        }

    }

}
