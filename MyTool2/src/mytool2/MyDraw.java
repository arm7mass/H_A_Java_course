package mytool2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDraw {

    private final JFrame form;
    private int wform;
    private int hform;

    public MyDraw(JFrame form) {
        this.form = form;
        wform = form.getWidth();
        hform = form.getHeight();

    }
    public int border = 1;
    public Color color = Color.black;

// Draw line method 
    public void DrawLine(int x1, int y1, int x2, int y2) {
        JPanel pnl = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(border));
                g2.setColor(color);
                g2.drawLine(x1, y1, x2, y2);
            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, form.getWidth(), form.getHeight());
    }
// Draw rectangle Method 

    public void DrawRect(int x, int y, int width, int height) {
        JPanel pnl = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(border));
                g2.setColor(color);
                g2.drawRect(x, y, width, height);
            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wform, hform);
    }
// Draw Oval Method 

    public void DrawOval(int x, int y, int width, int height) {
        JPanel pnl = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(color);
                g2.setStroke(new BasicStroke(border));
                g2.drawOval(x, y, width, height);
            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wform, hform);

    }
// Draw Polygon Method 

    public void DrawPolygon(int xpoints[], int ypoints[], int npoints) {
        JPanel pnl = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(color);
                g2.setStroke(new BasicStroke(border));
                g2.drawPolygon(xpoints, ypoints, npoints);
            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wform, hform);
    }
}
