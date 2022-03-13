package pl.pawel.warhammer.generator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CharacterNameGeneratorTest {

    @Mock
    private Random random;

    @InjectMocks
    private CharacterNameGenerator characterNameGenerator;

    @Test
    public void shouldGeneratePjoter() {
        when(random.nextInt(anyInt())).thenReturn(0);
        assertThat(characterNameGenerator.generateName()).isEqualTo("Pjoter");
    }

    @Test
    public void shouldGeneratePawel() {
        when(random.nextInt(anyInt())).thenReturn(1);
        assertThat(characterNameGenerator.generateName()).isEqualTo("Paweł");
    }

    @Test
    public void shouldGenerateSurname() {
        assertThat(characterNameGenerator.generateSurname()).isEqualTo("Larysz");
    }
}
