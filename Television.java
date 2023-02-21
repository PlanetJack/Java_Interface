package Interface_Implement;

public class Television implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TurnOn the TV");
	}

	@Override
	public void turnOff() {
		System.out.println("TurnOff the TV||");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}	
		System.out.println("Current TV volume : " + this.volume);
	}
}
