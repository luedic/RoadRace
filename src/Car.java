
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Car extends JPanel {
	private Image sprite;
	private float locX;
	private float locY;


	private int turn = 0;
	private int width = 56;
	private int height = 24;
	Rectangle[] arrayWall = new Rectangle[] { 
			new Rectangle(147, 181, 568, 39), 
			new Rectangle(611, 221, 106, 671),
			new Rectangle(720, 812, 711, 87), 
			new Rectangle(1197, 194, 74, 604), 
			new Rectangle(1274, 205, 353, 58),
			new Rectangle(23, 432, 418, 64), 
			new Rectangle(902, 14, 86, 642), 
			new Rectangle(1426, 502, 488, 54) };

	public Car(float locX, float locY) {
		this.locX = locX;
		this.locY = locY;
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponents(g2d);
		ImageIcon ic = new ImageIcon("images/TestStrecke2.png");
		Image bg = ic.getImage();
		g.drawImage(bg, 0, 0, null);
		ImageIcon i = new ImageIcon("images/mercedes.png");
		sprite = i.getImage();
		g.drawRect((int) locX+height/2, (int) locY, height, height);
		g2d.rotate(Math.toRadians(turn), locX+width/2, locY+height/2);
		g2d.drawImage(sprite, (int) locX, (int) locY, null);
	}

	public void checkColision() {
		Rectangle hitBox = this.getHitBox();
		if (arrayWall != null) {
			for (Rectangle wall : arrayWall) {
				if(wall!=null) {
					if (hitBox.intersects(wall)) {
					} else {
					}
				}
			}
		}
	}

	public Rectangle getHitBox() {
		return new Rectangle((int) locX-height, (int) locY, height, height);
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