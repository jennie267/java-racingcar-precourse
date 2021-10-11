package racinggame;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {
	private Cars cars;

	@BeforeEach
	void setUp() {
		cars = new Cars("car1,car2,car3");
	}

	@DisplayName("자동차 이름은 쉼표 기준으로 여러대 입력받는다.")
	@Test
	void 여러대_입력() {
		cars.countCar();
		assertThat(cars.countCar()).isEqualTo(3);
	}

}
