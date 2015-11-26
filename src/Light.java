
public class Light {
	private String location;
	
	public Light(String location) {
		super();
		this.location = location;
	}

	public void on() {
		System.out.println("Light is on now!! "+location);
	}

	public void off() {
		System.out.println("Light is off now!! "+location);

	}

}
