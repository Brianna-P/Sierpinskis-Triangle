import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class SierpFrame extends JFrame{
	private SierpPanel panel;

	public SierpFrame() {
		setTitle("Sierpinski Triangle");
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(screenSize.width/2, screenSize.height/2);
		panel = new SierpPanel(this);
		add(panel);
		setVisible(true);
	} 
}