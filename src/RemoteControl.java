
public class RemoteControl {
	private Command[] onCommands = new Command[7];
	private Command[] offCommands = new Command[7];
	public RemoteControl() {
		for(int i=0;i<7;i++){
			onCommands[i] = new noCommand();
			offCommands[i] = new noCommand();			
		}		
	}
	
	public void setCommandSlot(int slotNumber,Command onCommand,Command offCommand){
		onCommands[slotNumber] = onCommand;
		offCommands[slotNumber] = offCommand;			
	}
	
	public void pushOnButton(int slotNumber){
		onCommands[slotNumber].execute();		
	}
	
	public void pushOffButton(int slotNumber){
		offCommands[slotNumber].execute();		
	}
	

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<onCommands.length;i++){
			buffer.append("Slot # "+i+" on Command "+onCommands[i].getClass().getName() +" offCommand "+offCommands[i].getClass().getName());			
		}		
		return super.toString();
	}
	
	
	
	
	
	
	
	
	

}
