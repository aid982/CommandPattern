
public class main {

	public static void main(String[] args) {
		//SimpleRemoteControl remote = new SimpleRemoteControl();
		Light lightLivingRoom = new Light("in the living room");
		LightOnCommand lightOnCommandLivingRoom = new LightOnCommand(lightLivingRoom);
		LightOffCommand lightOffCommandLivingRoom = new LightOffCommand(lightLivingRoom);
		
		Light lightkitchen = new Light("in the kitchen room");
		LightOnCommand lightOnCommandkitchen = new LightOnCommand(lightkitchen);
		LightOffCommand lightOffCommandkitchen = new LightOffCommand(lightkitchen);
		

		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new  GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorCloseCommand = new  GarageDoorCloseCommand(garageDoor);
		
		/*remote.setSlot(lightOnCommand);
		remote.buttonWasPressed();
		
		remote.setSlot(garageDoorOpenCommand);
		remote.buttonWasPressed();*/
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommandSlot(0, lightOnCommandLivingRoom, lightOffCommandLivingRoom);
		remoteControl.setCommandSlot(1, garageDoorOpenCommand, garageDoorCloseCommand);
		remoteControl.setCommandSlot(2, lightOnCommandkitchen, lightOffCommandkitchen);		
		remoteControl.pushOnButton(0);		
		
		MacroCommand turnOnAll =  new MacroCommand(new Command[]{lightOnCommandkitchen,lightOnCommandLivingRoom,garageDoorOpenCommand});
		MacroCommand turnOffAll =  new MacroCommand(new Command[]{lightOffCommandkitchen,lightOffCommandLivingRoom,garageDoorCloseCommand});
		remoteControl.setCommandSlot(3, turnOnAll, turnOffAll);
		remoteControl.pushOnButton(3);
		


	}

}
