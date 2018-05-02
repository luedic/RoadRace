
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.nio.file.Path;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Car extends JPanel {
	private Image sprite;
	private int locX;
	private int locY;
	private int width = 56;
	private int height = 24;
<<<<<<< HEAD
		
	
	public Car(int locX,int locY) {
=======

	public Car(int locX, int locY) {
>>>>>>> 04ee234178c8d9573ac5c0e522da186e6233d38a
		this.locX = locX;
		this.locY = locY;
	}


	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.RED);
		g.drawRect(locX, locY, width, height);
		ImageIcon i = new ImageIcon("images/mercedes.png");
		sprite = i.getImage();
		g.drawImage(sprite, locX, locY, null);
	}

	public int getLocX() {
		return locX;
	}

	public void setLocX(int locX) {
		this.locX = locX;
	}

	public int getLocY() {
		return locY;
	}

	public void setLocY(int locY) {
		this.locY = locY;
	}
}