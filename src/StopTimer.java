
public class StopTimer {
	private long starttime=0;
	private long endtime=0;
	
	
	
	
	public void start() {
		starttime=System.currentTimeMillis();
	}
	
	public void stop() {
		endtime=System.currentTimeMillis();
	}
	
	public double getTimeMillis() {
		return endtime-starttime;
	}
	
	public double getTimeSec() {
		return (getTimeMillis()/100)/10;
		
	}
}
