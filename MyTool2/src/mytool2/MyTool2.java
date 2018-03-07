package mytool2;

import java.awt.Color;

public class MyTool2 {

    public static void main(String[] args) {
        frm f = new frm();
        MyDraw d = new MyDraw(f);
        d.border = 10;
        d.color = Color.blue;
       // d.DrawLine(10, 30, 150, 30);
        d.DrawRect(10, 30, 100, 50);
        f.setVisible(true);

    }

}
