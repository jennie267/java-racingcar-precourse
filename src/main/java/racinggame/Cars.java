package racinggame;

import java.util.ArrayList;
import java.util.List;

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

}
