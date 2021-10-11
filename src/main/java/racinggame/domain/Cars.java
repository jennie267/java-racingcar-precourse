package racinggame.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import nextstep.utils.Randoms;

public class Cars implements Iterable<Car> {
	private final List<Car> cars;

	public Cars(String inputCars) {
		this.cars = mapCar(inputCars);
	}

	private static List<Car> mapCar(String inputCars) {
		String[] splitCars = inputCars.split(",");
		if (splitCars.length == 0) {
			throw new IllegalArgumentException("[ERROR] 자동차를 하나 이상 입력해주세요.");
		}
		List<Car> cars = new ArrayList<Car>();
		for (String car : splitCars) {
			cars.add(new Car(car));
		}
		return cars;
	}

	public int countCar() {
		return cars.size();
	}

	public void play() {
		for (Car car : cars) {
			car.move(Randoms.pickNumberInRange(0, 9));
		}
	}

	public List<Car> getCars() {
		return cars;
	}

	public Winner endGame() {
		Winner winner = new Winner();
		for (Car car : cars) {
			winner.findWinner(car);
		}
		return winner;
	}

	@Override
	public Iterator<Car> iterator() {
		return cars.iterator();
	}

}
