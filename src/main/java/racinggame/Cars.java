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

}
