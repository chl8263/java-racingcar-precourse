package racingcar.domain;

import racingcar.game.Game;
import racingcar.game.GameProvider;

public class CarName {
    private static final int MAX_NAME_LENGTH = 5;

    String name;

    public static CarName of(String name) {
        return new CarName(name);
    }

    public CarName(String name) {
        if (name.length() > MAX_NAME_LENGTH) throw new IllegalArgumentException("이름의 길이가 5자를 넘을 수 없습니다.");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
