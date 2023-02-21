package Interface_Implement;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;
		
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(122);
		rc.turnOff();
		
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
