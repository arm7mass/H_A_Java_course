package mytool2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
// Draw String Method

    public void DrawString(int x, int y, String text, String fontname, int fontsize) {
        JPanel pnl = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(color);
                Font font = new Font(fontname, Font.BOLD, fontsize);
                g2.setFont(font);
                g2.drawString(text, x, y);
            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wform, hform);
        
    }
// Draw Image Method

    public void DrawImage(int x, int y, String path) {
        JPanel pnl = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                File imgfile = new File(path);
                try {
                    Image imge = ImageIO.read(imgfile);
                    g2.drawImage(imge, x, y, form);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    
                }
            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wform, hform);
    }

    // Draw Round Rectangle
    public void DrawRoundRect(int x, int y, int width, int height, int BorderRadius) {
        JPanel pnl = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(color);
                g2.setStroke(new BasicStroke(border));
                g2.drawRoundRect(x, y, width, height, BorderRadius, BorderRadius);
            }
            
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wform, hform);
    }
}
