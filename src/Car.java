
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Car extends JPanel {
	private Image sprite;
	private float locX;
	private float locY;
	private int turn = 0;
	private int width = 56;
	private int height = 24;

	public Car(float locX, float locY) {
		this.locX = locX;
		this.locY = locY;
	}


	public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
		super.paintComponents(g2d);
		ImageIcon i = new ImageIcon("images/mercedes.png");
		sprite = i.getImage();
		g2d.rotate(Math.toRadians(turn),locX, locY);
		g2d.drawImage(sprite, (int)locX, (int)locY, null);
	}

	public float getLocX() {
		return locX;
	}

	public void setLocX(float f) {
		this.locX = f;
	}

	public float getLocY() {
		return locY;
	}

	public void setLocY(float locY) {
		this.locY = locY;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}
}