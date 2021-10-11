package racinggame.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarNameTest {
	private Car car;

	@BeforeEach
	void setUp() {
		car = new Car("jen");
	}
	
	@DisplayName("자동차 이름 5자 이하만 가능")
	@Test
	void 이름_5자_이하() {
		assertThat(car.getCarName().checkLenght()).isTrue();
	}

	@DisplayName("자동차 이름 5자 넘으면 오류")
	@Test
	void 이름_5자_초과() {
		assertThrows(IllegalArgumentException.class, () -> new Car("jennie"));
	}

}
