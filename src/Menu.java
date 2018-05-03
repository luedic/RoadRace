import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame{
	private int width;
	private int height;
	



	public Menu (int width, int height) {
		this.width=width;
		this.height=height;
		this.setSize(width, height);
		this.setTitle("Menu");
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BackgroundMenu bm = new BackgroundMenu();
		bm.setLayout(null);
		addButtons(bm);
		this.add(bm);
	}
	
	
	public void addButtons(JPanel panel) {
		JButton button = new JButton("Starte");
		button.setSize(100,50);
		button.setLocation(450,308);
		button.addActionListener(new ButtonListener(this));
		panel.add(button);
	}
		
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}