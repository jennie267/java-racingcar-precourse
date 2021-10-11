package racinggame;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	void 자동차_이름_부여() {
		Car car = new Car("jennie");
		assertThat(car.getName()).isEqualTo("jennie");
	}

}
