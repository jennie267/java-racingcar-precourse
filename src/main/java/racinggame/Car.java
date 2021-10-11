package racinggame;

public class Car {
	private final CarName name;
	private StringBuilder position;

	public Car(String name) {
		this.name = new CarName(name);
		this.position = new StringBuilder();
	}

	public CarName getCarName() {
		return this.name;
	}

	private void go() {
		position.append("-");
	}

	public String getPosition() {
		return this.position.toString();
	}

	public void move(int randomNumber) {
		if (randomNumber >= 4) {
			go();
		}
	}
	
	public int getLength() {
		return this.position.length();
	}

}
