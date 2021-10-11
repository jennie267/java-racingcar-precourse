package racinggame;

import java.util.ArrayList;
import java.util.List;

import nextstep.utils.Randoms;

public class Cars {
	private final List<Car> cars;

	public Cars(String inputCars) {
		this.cars = mapCar(inputCars);
	}

	private static List<Car> mapCar(String inputCars) {
		String[] splitCars = inputCars.split(",");
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

	public String endGame() {
		String[] winner = { "", "" };
		for (Car car : cars) {
			winner = findWinner(winner, car);
		}
		if (winner[1].indexOf(",") == 0) {
			winner[1] = winner[1].substring(1);
		}
		return winner[1];
	}

	private String[] findWinner(String[] winner, Car car) {
		if (winner[0].length() < car.getLength()) {
			winner[0] = car.getPosition();
			winner[1] = car.getCarName().getName();
			return winner;
		}
		if (winner[0].length() == car.getLength()) {
			winner[1] += "," + car.getCarName().getName();
			return winner;
		}
		return winner;
	}

}
