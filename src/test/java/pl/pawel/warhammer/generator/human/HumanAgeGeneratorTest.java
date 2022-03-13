package pl.pawel.warhammer.generator.human;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HumanAgeGeneratorTest {

    @Test
    public void shouldGenerateAge() {
        final int age = new HumanAgeGenerator().generate();

        assertThat(age).isNotNull();
    }
}