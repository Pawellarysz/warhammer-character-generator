package pl.pawel.warhammer.generator.human;

import pl.pawel.warhammer.generator.Character;

public class Human implements Character {

    private final String name;
    private final String surname;
    private final int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String getRace() {
        return "human";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public int getAge() {
        return age;
    }
}
