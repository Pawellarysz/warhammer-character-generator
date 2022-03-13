package pl.pawel.warhammer.generator;

import java.util.Random;

public class CharacterNameGenerator {

    private final static String[] names = new String[] { "Pjoter", "Paweł", "Marian", "Anna", "Magda" };

    private final Random random;

    public CharacterNameGenerator(Random random) {
        this.random = random;
    }

    public String generateName() {
        return names[random.nextInt(names.length)];
    }

    public String generateSurname() {
        return "Larysz";
    }
}
