
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

    public static void msgBox(String Message) {
        JOptionPane.showMessageDialog(null, Message);
    }

    public static void createFolder(String Foldername, String path) {
        File f = new File(path + "/" + Foldername);
        f.mkdir();

    }

    public static void createFolder(String Foldername) {
        File f = new File(Foldername);
        f.mkdir();

    }

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

    public static void CreateEmptyFile(String FileName) {

        File f = new File(FileName);
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void CreateFile(String FileName, Object MyData[]) {
        try {
            PrintWriter p = new PrintWriter(FileName);
            for (Object obj : MyData) {
                p.println(obj);

            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Object InputBox(String title) {
        Object myobj = JOptionPane.showInputDialog(title);
        return myobj;
    }

    public static String GetNumber(String text) {
        String val = "";
        for (char c : text.toCharArray()) {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                val += c;
            }
        }
        return val;
    }

    public static int GetIntNumber(String text) {
        String val = "";
        for (char c : text.toCharArray()) {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                val += c;
            }
        }
        return Integer.parseInt(val);
    }
}
