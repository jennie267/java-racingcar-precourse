package racinggame.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import nextstep.utils.Randoms;

public class WinnerTest {
	private Cars cars;

	@BeforeEach
	void setUp() {
		cars = new Cars("car1,car2,car3");
	}

	@DisplayName("우승자 계산")
	@Test
	void findWinner() {
		try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
			mockRandoms
				.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
				.thenReturn(3,5,7);
			cars.play();
			Winner winner = new Winner();
			for (Car car : cars) {
				winner.findWinner(car);
			}
			assertThat(winner.toString()).contains("car2,car3");
		}
	}

}
