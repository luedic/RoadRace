import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FinishScreen extends JFrame{
	private int width;
	private int height;
	


	public FinishScreen (int width, int height,double score) {
		this.width=width;
		this.height=height;
		this.setSize(width, height);
		this.setTitle("Finish");
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lb = new JLabel();
		this.add(lb,BorderLayout.NORTH);
		String s = "Du hast "+score+" Sekunden gebraucht";
		lb.setText(s);
		BackgroundMenu bm =new BackgroundMenu();
		this.add(bm,BorderLayout.CENTER);
		JButton button = new JButton("Nochmal Spielen");
		button.addActionListener(new ButtonListener(this));
		this.add(button,BorderLayout.SOUTH);
	}
	

}
