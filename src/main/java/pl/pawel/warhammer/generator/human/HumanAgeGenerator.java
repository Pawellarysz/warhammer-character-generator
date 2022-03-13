package pl.pawel.warhammer.generator.human;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HumanAgeGenerator {

    private final Random random = ThreadLocalRandom.current();

    public int generate() {
        return random.nextInt(120);
    }
}
