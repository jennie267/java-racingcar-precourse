package racinggame;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
	private Car car;

	@BeforeEach
	void setUp() {
		car = new Car("jen");
	}

	@Test
	void 이름_부여() {
		assertThat(car.getCarName().isName("jen")).isTrue();
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
	
	@DisplayName("자동차 이름 5자 이하만 가능")
	@Test
	void 이름_5자_이하() {
		assertThat(car.getCarName().checkLenght()).isTrue();
	}
	
	@DisplayName("자동차 이름 5자 넘으면 오류")
	@Test
	void 이름_5자_초과() {
		assertThrows(IllegalArgumentException.class,() -> new Car("jennie"));
	}
	
	@DisplayName("0에서 9사이의 랜덤값 생성")
	@Test
	void 랜덤값_생성() {
		int randomNumber = car.makeRandomNumber();
		assertThat(randomNumber > -1 && randomNumber <10).isTrue();
	}

}
