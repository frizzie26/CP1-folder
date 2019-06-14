
import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  // Creates title for the frame and is creating the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits the program
		frame.setSize(400, 400); // Sets teh width and Height
        Shapes r = new Shapes(); // Creating the shapes object
        frame.add(r); // adding r to the frame
        
        frame.setVisible(true); // Show frame
	}
}

