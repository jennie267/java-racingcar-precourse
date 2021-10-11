package racinggame.controller;

import racinggame.Cars;
import racinggame.view.GameView;

public class GameController {

	private GameView gameView = new GameView();

	public void start() {
		Cars cars = enterCars();
		int tryNumber = gameView.enterTryNumber();
		for (int i = 0; i < tryNumber; i++) {
			cars.play();
			gameView.printResult(cars.getCars());
		}
	}

	private Cars enterCars() {
		try {
			return new Cars(gameView.enterCarsName());
		} catch (IllegalArgumentException e) {
			gameView.printErrorMessage(e.getMessage());
			return enterCars();
		}
	}

}
