package racinggame;

import nextstep.utils.Randoms;

public class Car {
	private final CarName name;
	private int position;

	public Car(String name) {
		this.name = new CarName(name);
		this.position = 0;
	}

	public CarName getCarName() {
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
	
	public int makeRandomNumber() {
		return Randoms.pickNumberInRange(0, 9);
	}

}
