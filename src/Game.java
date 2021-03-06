import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game implements Runnable {
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	public JFrame jf;
	KeyInput ki = new KeyInput(this);
	JLabel jl = new JLabel();
	private Car c = new Car(314, 54);

	private boolean up = false;
	private boolean down = false;
	private boolean right = false;
	private boolean left = false;
	private boolean shift = false;
	private boolean r = false;

	public Game() {
		jf = new JFrame("RoadRace");
		new Window((int) width + 1, (int) height + 1, "RoadRace", jf);
		jf.addKeyListener(ki);
		jf.setFocusable(true);
		jf.setVisible(true);
	}

	public void run() {
		StopTimer watch = new StopTimer();
		BackgroundWindow bw = new BackgroundWindow();
		jf.add(bw);
		jf.add(c);
		jl.setLocation(0, 0);
		watch.start();
		while (true) { // Gameloop
			try {
				if (!c.checkCheat()) {
					c.setLocX(314);
					c.setLocY(54);
					c.setTurn(0);
				}
				float x = c.getLocX();
				float y = c.getLocY();
				int t = c.getTurn();
				float value = 0;
				if (this.isUp()) { // if key up is pressed
					if (!this.isDown()) { //with this you cant press up + down at the same time
						if (c.checkColision()) { //while there is no collision
							if (c.checkWin()) {
								break;
							}
							if (t <= 90) { //first quarter of the circle (down, right)
								if (t < 0) { //check to do a full turn else its under 0 and not in any quarter
									c.setTurn(360);
								}
								if (!this.isShift()) { //drive straight
									for (int i = 0; i < t; i++) {
										value += 0.055555555;
									}
									c.setLocX(x + 5 - value);
									c.setLocY(y + value);
								} else if (this.isShift() && this.isRight()) { //drift right
									c.setTurn(t + 3);
									c.setLocX(x + 3);
									c.setLocY(y + 1);
								} else if (this.isShift() && this.isLeft()) { //drift left
									c.setTurn(t - 3);
									c.setLocX(x + 1);
									c.setLocY(y + 3);
								}
							}
							if (t <= 180 && t > 90) { //second quarter of the circle (down, lwft)
								if (!this.isShift()) {
									for (int i = 0; i < t; i++) { //drive straight
										value += 0.055555555;
									}
									value -= 5;
									c.setLocX(x - value);
									c.setLocY(y + 5 - value);
								} else if (this.isShift() && this.isRight()) { //drift right
									c.setTurn(t + 3);
									c.setLocX(x - 1);
									c.setLocY(y + 3);
								} else if (this.isShift() && this.isLeft()) { //drift left
									c.setTurn(t - 3);
									c.setLocX(x - 3);
									c.setLocY(y + 1);
								}
							}
							if (t <= 270 && t > 180) { //third quarter of the circle (top, left)
								if (!this.isShift()) {
									for (int i = 0; i < t; i++) { //drive straight
										value += 0.055555555;
									}
									value -= 10;
									c.setLocX(x - 5 + value);
									c.setLocY(y - value);
								} else if (this.isShift() && this.isRight()) { //drift right
									c.setTurn(t + 3);
									c.setLocX(x - 3);
									c.setLocY(y - 1);
								} else if (this.isShift() && this.isLeft()) { //drift left
									c.setTurn(t - 3);
									c.setLocX(x - 1);
									c.setLocY(y - 3);
								}
							}
							if (t > 270) { //fourth quarter of the circle (top, right)
								if (t > 360) { //check to do a full turn else its over 360 and not in any quarter
									c.setTurn(0);
								}
								if (!this.isShift()) {
									for (int i = 0; i < t; i++) { //drive straight
										value += 0.055555555;
									}
									value -= 15;
									c.setLocX(x + value);
									c.setLocY(y - 5 + value);
								} else if (this.isShift() && this.isRight()) { //drift right
									c.setTurn(t + 3);
									c.setLocX(x + 1);
									c.setLocY(y - 3);
								} else if (this.isShift() && this.isLeft()) { //drift left
									c.setTurn(t - 3);
									c.setLocX(x + 3);
									c.setLocY(y - 1);
								}
							}
						}
					}
				}
				if (this.isDown()) { //if key down is pressed
					if (c.checkCheatWin()) {
						if (t <= 90) {
							if (t < 0) { //check to do a full turn else its under 0 and not in any quarter
								c.setTurn(360);
							}
							for (int i = 0; i < t; i++) { //drive backwards
								value += 0.011111111;
							}
							c.setLocX(x - 1 + value);
							c.setLocY(y - value);
						}
						if (t <= 180 && t > 90) {
							for (int i = 0; i < t; i++) { //drive backwards
								value += 0.011111111;
							}
							value -= 1;
							c.setLocX(x + value);
							c.setLocY(y - 1 + value);
						}
						if (t <= 270 && t > 180) {
							for (int i = 0; i < t; i++) { //drive backwards
								value += 0.011111111;
							}
							value -= 2;
							c.setLocX(x + 1 - value);
							c.setLocY(y + value);
						}
						if (t > 270) {
							if (t > 360) { //check to do a full turn else its over 360 and not in any quarter
								c.setTurn(0);
							}
							for (int i = 0; i < t; i++) { //drive backwards
								value += 0.011111111;
							}
							value -= 3;
							c.setLocX(x - value);
							c.setLocY(y + 1 - value);
						}
					}
				} // if key right is pressed
				if (this.isRight() && !this.isShift()) {
					if (c.checkColision()) {
						if (this.isDown() || this.isUp()) {
							c.setTurn(t + 2);
							if (t < 0) {
								c.setTurn(360);
							}
							if (t > 360) {
								c.setTurn(0);
							}
						}
					}
				} // if key left is pressed
				if (this.isLeft() && !this.isShift()) {
					if (c.checkColision()) {
						if (this.isDown() || this.isUp()) {
							c.setTurn(t - 2);
							if (t < 0) {
								c.setTurn(360);
							}
							if (t > 360) {
								c.setTurn(0);
							}
						}
					}
				}
				if(this.isR()) {
					c.setLocX(314);
					c.setLocY(54);
					c.setTurn(0);
				}
				Thread.sleep(10); //100x per second
				c.checkColision();
				jf.repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		watch.stop();
		jf.dispose();
		FinishScreen fs = new FinishScreen(1000, 666, watch.getTimeSec());
	}

	public boolean isShift() {
		return shift;
	}

	public void setShift(boolean shift) {
		this.shift = shift;
	}

	public void startGame() {
		this.run();
	}

	public JFrame getJf() {
		return jf;
	}

	public void setJf(JFrame jf) {
		this.jf = jf;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isLeft() {
		return left;
	}
	
	public boolean isR() {
		return r;
	}
	
	public void setR(boolean r) {
		this.r = r;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}
	public Car getC() {
		return c;
	}

	public void setC(Car c) {
		this.c = c;
	}


}
