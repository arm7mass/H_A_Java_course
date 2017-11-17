
import java.io.File;
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
}
