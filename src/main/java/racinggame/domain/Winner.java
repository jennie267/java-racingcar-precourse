package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Winner {
	private int maxNumber;
	private List<String> winnerName;

	public Winner() {
		this.maxNumber = 0;
		this.winnerName = new ArrayList<String>();
	}

	public void findWinner(Car car) {
		if (isEqualNumber(car)) {
			return;
		}
		if (isUpperThanMaxNumber(car)) {
			return;
		}
	}

	private boolean isUpperThanMaxNumber(Car car) {
		if (maxNumber < car.getLength()) {
			maxNumber = car.getLength();
			winnerName.clear();
			winnerName.add(car.getCarName().getName());
			return true;
		}
		return false;
	}

	private boolean isEqualNumber(Car car) {
		if (maxNumber == car.getLength()) {
			maxNumber = car.getLength();
			winnerName.add(car.getCarName().getName());
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return String.join(",", winnerName);
	}

}
