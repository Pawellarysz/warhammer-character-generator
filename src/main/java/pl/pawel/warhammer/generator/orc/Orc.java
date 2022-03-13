package pl.pawel.warhammer.generator.orc;

import pl.pawel.warhammer.generator.Character;

public class Orc implements Character {

    @Override
    public String getRace() {
        return "orc";
    }

    @Override
    public String getName() {
        return "Ugabugand";
    }

    @Override
    public String getSurname() {
        return "The Strong";
    }

    @Override
    public int getAge() {
        return 19;
    }
}
