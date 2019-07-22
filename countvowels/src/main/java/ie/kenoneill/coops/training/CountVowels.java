package ie.kenoneill.coops.training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountVowels {
    Map<String, Integer> freq = new HashMap<>();
    Set<String> vowels = Stream.of("a", "e", "i", "o", "u").collect(Collectors.toCollection(HashSet::new));

    public CountVowels(String word) {
        freq = Arrays.stream(word.toLowerCase().split(""))
            .filter(x -> vowels.contains(x))
            .collect(Collectors.toMap(key -> key, key -> 1, Integer::sum));

/*
        //int count = 0;
        for(char ch : word.toCharArray()) {

        }
*/

    }

    public int countA() {
        return freq.getOrDefault("a", 0);
    }

    public int countE() {
        return freq.getOrDefault("e", 0);
    }

    public int countI() {
        return freq.getOrDefault("i", 0);
    }

    public int countO() {
        return freq.getOrDefault("o", 0);
    }

    public int countU() {
        return freq.getOrDefault("u", 0);
    }
}
