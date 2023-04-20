package rafaelferreros.kata.countcharacters;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class CountCharactersFunctional implements CountCharacters {
    @Override
    public Map<String, Long> getMap(String dataToMap) {
        return Arrays.stream(dataToMap.toLowerCase().split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    }
}
