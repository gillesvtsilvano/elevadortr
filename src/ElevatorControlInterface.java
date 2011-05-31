
public interface ElevatorControlInterface {
	public void processEvent(Event in, Event out);

	public State currentState();
}
