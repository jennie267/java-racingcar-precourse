package racinggame.domain;

public class Car {
	public static final int MOVE_STANDARD_NUMBER = 4;
	
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
		if (randomNumber >= MOVE_STANDARD_NUMBER) {
			go();
		}
	}
	
	public int getLength() {
		return this.position.length();
	}

}
