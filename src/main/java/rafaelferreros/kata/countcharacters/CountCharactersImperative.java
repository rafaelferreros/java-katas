package rafaelferreros.kata.countcharacters;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CountCharactersImperative  implements CountCharacters {
    @Override
    public Map<String, Long> getMap(String dataToMap) {

        final List<String> characters = stringToList(dataToMap);
        final Map<String, Long> mapResult = new HashMap<>();
        for (String character : characters) {
            if (mapResult.containsKey(character)) {
                long count = mapResult.get(character);
                count++;
                mapResult.put(character, count);
            } else {
                mapResult.put(character, 1L);
            }
        }
        return mapResult;
    }
}
