import javax.swing.JFrame;

public class Camera {
	private int locCamX;
	private int locCamY;
	
	
	
	
	public Camera(int x, int y) {
		this.locCamX=x;
		this.locCamY=y;
	}













	public void setCamera(Car c,JFrame jf) {
		locCamX=c.getLocX()-(jf.getWidth()/2);
		locCamY=c.getLocY()-(jf.getHeight()/2);
		System.out.println("X: "+locCamX);
		System.out.println("Y: "+locCamY);
//		if (locCamX == 0 && locCamY == 0) {
//			System.out.println("no error cam");
//		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getLocCamX() {
		return locCamX;
	}
	public void setLocCamX(int locCamX) {
		this.locCamX = locCamX;
	}
	public int getLocCamY() {
		return locCamY;
	}
	public void setLocCamY(int locCamY) {
		this.locCamY = locCamY;
	}
}
