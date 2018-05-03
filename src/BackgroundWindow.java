import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackgroundWindow extends JPanel{
	Image bg;
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		System.out.println("test");
		ImageIcon i = new ImageIcon("images/TestStrecke.png");
		bg = i.getImage();
		g.drawImage(bg, 0, 0, null);
	}
}

