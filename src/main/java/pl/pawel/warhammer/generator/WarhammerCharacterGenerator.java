package pl.pawel.warhammer.generator;

import pl.pawel.warhammer.generator.human.Human;
import pl.pawel.warhammer.generator.human.HumanCharacterGenerator;
import pl.pawel.warhammer.generator.orc.Orc;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class WarhammerCharacterGenerator {

    private static final HumanCharacterGenerator HUMAN_CHARACTER_GENERATOR = new HumanCharacterGenerator();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Warhammer character generator");
        System.out.print("Type race: ");
        final String race = scanner.nextLine();

        Character character;
//        Arrays.stream(args).forEach(System.out::println);
        switch (race) {
            case "human":
                character = HUMAN_CHARACTER_GENERATOR.generate();
                break;
            case "orc":
                character = new Orc();
                break;
            default:
                throw new RuntimeException("Unexpected race: " + race);
        }
        System.out.println("New " + character.getRace());
        System.out.println("Name: " + character.getName());
        System.out.println("Surname:" + character.getSurname());
        System.out.println("Age:" + character.getAge());
    }
}
