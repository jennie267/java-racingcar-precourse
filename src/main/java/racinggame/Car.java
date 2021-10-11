package racinggame;

public class Car {
	private final String name;
	private int position;

	public Car(String name) {
		this.name = name;
		this.position = 0;
	}

	public String getName() {
		return this.name;
	}

	private void go() {
		this.position++;
	}

	public int getPosition() {
		return this.position;
	}

	public void move(int randomNumber) {
		if (randomNumber >= 4) {
			go();
		}
	}

}
