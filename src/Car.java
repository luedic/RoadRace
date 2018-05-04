
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

	Rectangle[] arrayWall = new Rectangle[] { new Rectangle(147, 181, 568, 39), new Rectangle(611, 221, 106, 671),
			new Rectangle(720, 812, 711, 87), new Rectangle(1197, 194, 74, 604), new Rectangle(1274, 205, 353, 58),
			new Rectangle(23, 432, 418, 64), new Rectangle(902, 14, 86, 642), new Rectangle(1426, 502, 488, 54),
			new Rectangle(-1, 0, 1920, 1), new Rectangle(-1, 0, 1, 1080), new Rectangle(0, 1080, 1920, 1),
			new Rectangle(1920, 0, 1, 1080) };
	Rectangle[] arrayCheatWall = new Rectangle[] { new Rectangle(156, 186, 546, 29), new Rectangle(621, 225, 75, 666),
			new Rectangle(730, 820, 691, 67), new Rectangle(1207, 199, 54, 594), new Rectangle(1284, 210, 333, 5),
			new Rectangle(33, 437, 398, 36), new Rectangle(912, 19, 66, 625), new Rectangle(1436, 507, 468, 49),
			new Rectangle(0, -6, 1920, 1), new Rectangle(-6, 0, 1, 1080), new Rectangle(0, 1085, 1920, 1),
			new Rectangle(1925, 0, 1, 1080) };
	int finishX = 251;
	int finishY = 0;
	int round = 0;

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
		g2d.rotate(Math.toRadians(turn), locX + width / 2, locY + height / 2);
		g2d.drawImage(sprite, (int) locX, (int) locY, null);
	}

	public boolean checkColision() {
		Rectangle hitBox = this.getHitBox();
		if (arrayWall != null) {
			for (Rectangle wall : arrayWall) {
				if (wall != null) {
					if (hitBox.intersects(wall)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public boolean checkWin() {
		if (locX >= finishX && locX <= finishX + 4 && locY >= finishY && locY <= finishY + 179) {
			round++;
			System.out.println(round);
			if (round > 1) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkCheatWin() {
		if (locX >= finishX + 10 && locX <= finishX + 14 && locY >= finishY && locY <= finishY + 179) {
			return false;
		}
		return true;
	}

	public boolean checkCheat() {
		Rectangle hitBox = this.getHitBox();
		if (arrayCheatWall != null) {
			for (Rectangle wallC : arrayCheatWall) {
				if (wallC != null) {
					if (hitBox.intersects(wallC)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public Rectangle getHitBox() {
		return new Rectangle((int) locX + height / 2, (int) locY, height, height);
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