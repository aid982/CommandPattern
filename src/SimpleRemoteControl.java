
public class SimpleRemoteControl {
	Command slot;

	public Command getSlot() {
		return slot;
	}

	public void setSlot(Command slot) {
		this.slot = slot;
	}
	
	public void buttonWasPressed(){
		slot.execute();
	}
	

}
