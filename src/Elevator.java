import java.util.Vector;


public class Elevator {
	private Vector<Boolean> targets;
	private boolean up;
	
	Elevator(){
		targets = new Vector<Boolean>(10);
		
		for(int i = 0; i < 10; ++i){
			targets.add(i, false);
		}
	}
	
}
