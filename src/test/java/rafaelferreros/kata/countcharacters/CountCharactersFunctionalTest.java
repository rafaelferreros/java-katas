package rafaelferreros.kata.countcharacters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Map;

class CountCharactersFunctionalTest {

    @InjectMocks
    CountCharactersFunctional countCharactersFunctional;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void test() {
        Map<String, Long> result = countCharactersFunctional.getMap(" TEST");
        Map<String, Long> expected = Map.of(
                " ", 1L,
                "t", 2L,
                "e", 1L,
                "s", 1L
        );
        Assertions.assertEquals(expected, result);
    }

}