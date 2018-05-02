import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu {

	public Menu (int width, int height, JFrame jf ) {
		jf.setSize(width, height);
		jf.setMaximumSize(new Dimension(width, height));
		jf.setMinimumSize(new Dimension(width, height));
		
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		jf.setLayout(new BorderLayout());
	}
	public void addButtons(JFrame jf,int width, int height) {
		JButton buttonS = new JButton("Auto auswählen");
		jf.add(buttonS);
		buttonS.setSize(width/10,height/12);
		buttonS.setLocation((int)((width/2)-(buttonS.getWidth()/2)),(int)((height/2)-(buttonS.getWidth()/2)));
		
	}
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		Menu menu = new Menu(1920,1080, jf);
		menu.addButtons(jf,1920,1080);
	}
}