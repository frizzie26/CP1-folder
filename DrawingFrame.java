import javax.swing.JFrame;

public class DrawingFrame
{
    public static void main(String[] args){
	
	// You should change the Title
        JFrame frame = new JFrame("DrawingFrame");
        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawingProject r = new DrawingProject();
        frame.add(r);
        
        frame.setVisible(true);
    }
}
