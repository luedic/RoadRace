import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackgroundMenu extends JPanel{
	Image bg;
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		System.out.println("test");
		ImageIcon i = new ImageIcon("images/background.png");
		bg = i.getImage();
		g.drawImage(bg, 0, 0, 1000,666, null);
	}
}
