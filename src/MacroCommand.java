
public class MacroCommand implements Command {
	Command[] commands;

	public Command[] getCommands() {
		return commands;
	}

	public void setCommands(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
			
		}
		
	}

	public MacroCommand(Command[] commands) {
		super();
		this.commands = commands;
	}

	@Override
	public void undo() {
		for (Command command : commands) {
			command.undo();
			
		}
		
	}
	

}
