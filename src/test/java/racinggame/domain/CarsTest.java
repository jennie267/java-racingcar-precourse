package racinggame.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import nextstep.utils.Randoms;

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
	
	@DisplayName("현재 위치가 제일 큰 자동차를 알 수 있다.")
	@Test
	void winner() {
        try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
            mockRandoms
                    .when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(3,5,7);
            cars.play();
            cars.endGame();
            assertThat(cars.endGame()).contains("car2,car3");
        }
	}

}
