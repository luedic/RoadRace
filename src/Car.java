
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Car extends JPanel{
	
	private int locX;
	private int locY;
	
	
	
	public Car(int locX,int locY) {
		this.locX = locX;
		this.locY = locY;
	}

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.RED);
		g.drawRect(locX, locY, 56, 24);
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