
import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
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
            Image img = ImageIO.read(Tools.class.getResource("pic.jpg"));
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

}
