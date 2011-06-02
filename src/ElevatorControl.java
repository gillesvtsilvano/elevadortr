import java.lang.reflect.Array;
import java.util.Queue;



public class ElevatorControl implements ElevatorControlInterface {
	
	private boolean running;
	private Array floorIn1;
	private Array floorIn2;
	private Array floorOut;
	
	public ElevatorControl(){

	}

	public void run(){
		this.running = true;
		
		while (running){
			processEvent();
		}
	}
	
	public int schedule(){
		
		return 0;
	}
	
	public void processEvent() {
		
	}
}
