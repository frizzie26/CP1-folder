

/**
 * The logo is going to be a NIKE logo
 *
 * Faridah
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingProject extends JComponent
{
    public void paintComponent(Graphics g){
        
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.gray);
        g2.fill(new Rectangle(0,0,450,250));
        /******** Put your code here  *********/
        // create new QuadCurve2D.Float
        QuadCurve2D q = new QuadCurve2D.Float();
        // draw QuadCurve2D.Float with set coordinates
        g2.setColor(Color.black);
        q.setCurve(125, 100, 70, 250, 350 , 100);
        g2.fill(q);
        q.setCurve(125, 100, 100, 175, 360, 150);
        g2.setColor(Color.gray);
       // g2.fill(q);
        q.setCurve(125, 100, 120, 200, 350, 100);
        g2.fill(q);
        
        
      

        // comment this out once you have finished
        //drawGrid(g2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
        }
    }
}
