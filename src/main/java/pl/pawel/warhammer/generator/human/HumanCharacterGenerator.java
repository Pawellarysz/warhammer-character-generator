package pl.pawel.warhammer.generator.human;

import pl.pawel.warhammer.generator.CharacterNameGenerator;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HumanCharacterGenerator {

    private final Random random = ThreadLocalRandom.current();
    private final CharacterNameGenerator characterNameGenerator = new CharacterNameGenerator(random);
    private final HumanAgeGenerator humanAgeGenerator = new HumanAgeGenerator();

    public Human generate() {

        return new Human(
                characterNameGenerator.generateName(),
                characterNameGenerator.generateSurname(),
                humanAgeGenerator.generate()
        );
    }
}
