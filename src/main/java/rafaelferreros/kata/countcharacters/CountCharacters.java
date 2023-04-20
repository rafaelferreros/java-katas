package rafaelferreros.kata.countcharacters;

import java.util.List;
import java.util.Map;

public interface CountCharacters {
    default List<String> stringToList(String value) {
        return List.of(value.toLowerCase().split(""));
    }
    default void printResult(Map<String, Long> toPrint) {
        toPrint.forEach((k,v) -> System.out.println("(" + k + ", " + v +")" ));
    }
    Map<String, Long> getMap(String dataToMap);
}
