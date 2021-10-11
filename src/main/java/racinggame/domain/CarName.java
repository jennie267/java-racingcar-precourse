package racinggame.domain;

public class CarName {
	public static final int MAX_LENGTH = 5;

	private String name;

	public CarName(String name) {
		if (name.length() == 0) {
			throw new IllegalArgumentException("[ERROR] 자동차 이름을 1자 이상 입력해주세요.");
		}
		if (name.length() == 0 || name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException("[ERROR] 자동차 이름은 "+MAX_LENGTH+"자 이하만 가능합니다.");
		}
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public boolean isName(String compareName) {
		return name.equals(compareName);
	}

	public boolean checkLenght() {
		return this.name.length() <= MAX_LENGTH;
	}

}
