

public class ElevatorControl implements ElevatorControlInterface {

	private Event doorBtUp;
	private Event doorBtDown;
	private Event elevatorBt;
	private Event floorSensor;
	private State elevatorState;
	
	public ElevatorControl(){
		this.doorBtUp = Event.ButtonRequestUpNone;
		this.doorBtDown = Event.ButtonRequestDownNone;
		this.elevatorBt = Event.ButtonSelectDestinyNone;
		this.floorSensor = Event.SensorFloorNone;
		this.elevatorState = State.Stopped;
	}
	
	public void processEvent(Event in, Event out) {
		
	}

	public State currentState(){
		return elevatorState;
	}
}
