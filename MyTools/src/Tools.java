
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
    public static void openForm (JFrame form ){
        
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
}
