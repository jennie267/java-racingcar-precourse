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

	@DisplayName("0에서 9사이의 랜덤값 생성")
	@Test
	void 랜덤값_생성() {
		int randomNumber = cars.makeRandomNumber();
		assertThat(randomNumber > -1 && randomNumber <10).isTrue();
	}
}
