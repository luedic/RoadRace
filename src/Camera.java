import javax.swing.JFrame;

public class Camera {
	private float locCamX;
	private float locCamY;
	
	
	
	
	public Camera(float x, float y) {
		this.locCamX=x;
		this.locCamY=y;
	}













	public void setCamera(Car c,JFrame jf) {
		locCamX=c.getLocX()-(jf.getWidth()/2);
		locCamY=c.getLocY()-(jf.getHeight()/2);
//		System.out.println("X: "+locCamX);
//		System.out.println("Y: "+locCamY);
//		if (locCamX == 0 && locCamY == 0) {
//			System.out.println("no error cam");
//		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public float getLocCamX() {
		return locCamX;
	}
	public void setLocCamX(float locCamX) {
		this.locCamX = locCamX;
	}
	public float getLocCamY() {
		return locCamY;
	}
	public void setLocCamY(float locCamY) {
		this.locCamY = locCamY;
	}
}
