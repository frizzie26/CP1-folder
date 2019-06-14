import javax.swing.JFrame;

public class Mickeyframe{
	public static void main(String[] args){
		JFrame frame = new JFrame("Mickeyframe");  // Creates title for the frame and is creating the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits the program
		frame.setSize(600, 600); // Sets teh width and Height
        MickeyShape r = new MickeyShape(); // Creating the shapes object
        frame.add(r); // adding r to the frame
        
        frame.setVisible(true); // Show frame
	}
}
