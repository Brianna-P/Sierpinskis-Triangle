import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SierpPanel extends JPanel{
	private SierpFrame frame;
	int screenWidth;
	int screenHeight;
	
	public SierpPanel(SierpFrame f){
		frame = f;
	}

	public void paintComponent(Graphics g) {
		
		screenWidth = getWidth();
		screenHeight = getHeight();

		super.paintComponent(g);
		g.setColor(Color.black);
		draw(g, 0, 0, screenWidth, screenHeight);
		System.out.println(screenWidth + " " + screenHeight);
	}

	public void draw(Graphics g, int x, int y, int w, int h){
		repaint();

		if(w <= 1 && h <= 1) { 
			g.drawRect(x, y, 1, 1);
		}
		else {
			draw(g, x + (h / 4), y, w / 2, h / 2);
			draw(g, x, y + (h / 2), w / 2, h / 2);
			draw(g, x + (h / 2), y + (h / 2), w / 2, h / 2);

		}
	}
}