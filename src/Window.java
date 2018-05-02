import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {
	
	public Window (int width, int height, String title, JFrame jf ) {
		jf.setPreferredSize(new Dimension(width, height));
		jf.setMaximumSize(new Dimension(width, height));
		jf.setMinimumSize(new Dimension(width, height));
		jf.setTitle(title);
		
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
}
