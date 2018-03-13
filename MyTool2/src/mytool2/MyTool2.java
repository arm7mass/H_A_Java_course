package mytool2;

import java.awt.Color;

public class MyTool2 {

    public static void main(String[] args) {
        frm f = new frm();
        MyDraw d = new MyDraw(f);
        d.border = 10;
        d.color = Color.blue;
        // d.DrawLine(10, 30, 150, 30);
        //d.DrawRect(10, 30, 100, 50);
        //d.DrawOval(100, 100, 100, 100);
        //int x[] = {100, 170, 170, 280, 280, 170, 170};
        //int y[] = {135, 80, 100, 100, 170, 170, 190};
        // d.DrawPolygon(x, y, 7);
        d.DrawString(20, 50, "My Name is Abdulrhman ", "tohama", 40);
        f.setVisible(true);

    }

}
