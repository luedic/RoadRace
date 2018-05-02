
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.nio.file.Path;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Car extends JPanel{
	private Image sprite;
	private int locX;
	private int locY;
	private int width = 56;
	private int height = 24;
		
	
	public Car(int locX,int locY) {
		this.locX = locX;
		this.locY = locY;
	}
	public void loadImage() {
        
        ImageIcon i = new ImageIcon("images/mercedes.png");
        sprite = i.getImage(); 
        width = sprite.getWidth(null);
        height = sprite.getHeight(null);
    }

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.RED);
		g.drawRect(locX, locY, width, height);
		g.drawImage(sprite ,locX, locY, null);
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