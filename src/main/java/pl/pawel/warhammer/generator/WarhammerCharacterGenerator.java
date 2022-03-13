package pl.pawel.warhammer.generator;

import pl.pawel.warhammer.generator.human.Human;
import pl.pawel.warhammer.generator.human.HumanCharacterGenerator;

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
//        Arrays.stream(args).forEach(System.out::println);
        switch (race) {
            case "human":
                final Human human = HUMAN_CHARACTER_GENERATOR.generate();

                System.out.println("New human:");
                System.out.println("Name: " + human.getName());
                System.out.println("Surname:" + human.getSurname());
                System.out.println("Age:" + human.getAge());
                break;
            case "orc":
                System.out.println("New orc:");
                System.out.println("Name: Ugabugand");
                System.out.println("Surname: The Strong");
                System.out.println("Age: 19");
                break;
            default:
                System.out.println("Unexpected race: " + race);
        }
    }
}
