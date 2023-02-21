package Interface_Implement;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TurnOn the Audio||");
	}

	@Override
	public void turnOff() {
		System.out.println("TurnOff the Audio||");
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
		System.out.println("Current Audio volume : " + this.volume);
	}
}
