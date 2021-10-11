package racinggame;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
	private Car car;

	@BeforeEach
	void setUp() {
		car = new Car("jennie");
	}

	@Test
	void 이름_부여() {
		assertThat(car.getName()).isEqualTo("jennie");
	}

	@Test
	void 전진() {
		car.move(4);
		assertThat(car.getPosition()).isEqualTo(1);
	}

	@Test
	void 정지() {
		car.move(3);
		assertThat(car.getPosition()).isEqualTo(0);
	}

	@Test
	void 현재위치() {
		car.move(1);
		car.move(3);
		car.move(5);
		car.move(7);
		assertThat(car.getPosition()).isEqualTo(2);
	}

}
