
public class GarageDoorCloseCommand implements Command{
	GarageDoor garageDoor;

	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}


	@Override
	public void execute() {
		garageDoor.down();		
	}


	@Override
	public void undo() {
		garageDoor.up();
		
	}
	
	
	
	

}
