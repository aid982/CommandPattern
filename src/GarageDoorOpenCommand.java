
public class GarageDoorOpenCommand implements Command{
	GarageDoor garageDoor;

	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}


	@Override
	public void undo() {
		garageDoor.down();
		
	}


	@Override
	public void execute() {
		garageDoor.up();		
	}
	
	

}
