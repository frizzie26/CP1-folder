import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class MickeyShape extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g; 

		g2.setColor(Color.black); 

		Ellipse2D.Double circle = new Ellipse2D.Double(200, 200, 200, 200);
		g2.fill(circle); 
        
        Ellipse2D.Double circle2 = new Ellipse2D.Double(350, 150, 100, 100);
                g2.fill(circle2);              
	
        Ellipse2D.Double circle3 = new Ellipse2D.Double(150, 150, 100, 100);
        g2.fill(circle3);
    }
}
