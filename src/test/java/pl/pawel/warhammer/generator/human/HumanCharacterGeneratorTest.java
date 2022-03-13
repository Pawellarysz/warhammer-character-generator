package pl.pawel.warhammer.generator.human;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HumanCharacterGeneratorTest {

    @Test
    public void shouldGenerateHuman() {
        final Human human = new HumanCharacterGenerator().generate();

        assertThat(human.getName()).isNotEmpty();
        assertThat(human.getSurname()).isNotEmpty();
        assertThat(human.getAge()).isNotNull();
    }
}
