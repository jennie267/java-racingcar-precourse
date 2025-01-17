package racinggame.view;

import nextstep.utils.Console;
import racinggame.domain.Car;
import racinggame.domain.Cars;
import racinggame.domain.Winner;

public class GameView {

	public String enterCarsName() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		return Console.readLine();
	}

	public int enterTryNumber() {
		System.out.println("시도할 회수는 몇회인가요?");
		try {
			return Integer.parseInt(Console.readLine());
		} catch (NumberFormatException e) {
			System.out.println("[ERROR] 숫자만 입력 가능합니다.");
			return enterTryNumber();
		}
	}

	public void printErrorMessage(String error) {
		System.out.println(error);
	}

	public void printResult(Cars cars) {
		for (Car car : cars) {
			System.out.println(car.getCarName().getName() + " : " + car.getPosition());
		}
		System.out.println();
	}

	public void printWinner(Winner winner) {
		System.out.println("최종 우승자는 " + winner.toString() + " 입니다.");
	}

}
