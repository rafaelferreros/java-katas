package rafaelferreros.kata.services;

import org.springframework.stereotype.Service;
import rafaelferreros.kata.countcharacters.CountCharacters;
import rafaelferreros.kata.countcharacters.CountCharactersFunctional;
import rafaelferreros.kata.countcharacters.CountCharactersImperative;

import java.util.Map;

@Service
public class KataService {

    private final CountCharactersFunctional countCharactersFunctional;
    private final CountCharactersImperative countCharactersImperative;

    public KataService(
            CountCharactersFunctional countCharactersFunctional,
            CountCharactersImperative countCharactersImperative
    ) {
        this.countCharactersFunctional = countCharactersFunctional;
        this.countCharactersImperative = countCharactersImperative;
    }

    public void runKatas() {
        System.out.println("Run countCharacters");
        final String testData = "This is a long string to test the implementations";
        Map<String, CountCharacters> implementationsMap = Map.of(
                "Imperative", countCharactersImperative,
                "Functional", countCharactersFunctional
        );

        implementationsMap.forEach((name, implementation) -> executeCountCharacter(name, implementation, testData));
    }

    private void executeCountCharacter(String name, CountCharacters implementation, String testData) {
        System.out.println(name);
        Map<String, Long> resultMap = implementation.getMap(testData);
        implementation.printResult(resultMap);
    }

}
