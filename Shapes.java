
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class Shapes extends JComponent{

public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g; // importing Graphics2D

		Rectangle box = new Rectangle(5, 10, 50, 30); // Creating a rectangle at x:5 y:10 wight:20 height: 30
		g2.draw(box); // Draw rectangle on component

		g2.setColor(Color.blue); // Sets color to blue

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200); // 
		g2.fill(circle); // Fills in a circle
                g2.setColor(Color.black);
                Rectangle bb = new Rectangle(100, 100, 200, 200);
	        g2.draw(bb);

	}
}

