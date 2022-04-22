package racingcar.domain;

import java.util.List;

public class Racing {
    private final int racingCount;
    private final List<RacingCar> racingCars;

    public Racing(int racingCount, List<RacingCar> racingCars) {
        this.racingCount = racingCount;
        this.racingCars = racingCars;
    }

    public void addRacingCar(RacingCar racingCar) {
        racingCars.add(racingCar);
    }

    public void race() {
        for (int i = 0; i < racingCount; i++) {
            carsMove();
        }
    }

    private void carsMove() {
        for (RacingCar racingCar: racingCars) {
            racingCar.move();
        }
    }
}
