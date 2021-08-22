package school.lesson1;

import java.util.*;

public class UniqueWordsTest {
    public static void main(String[] args) {
        String[] arrayOfWords = {
                "Александр", "Алексей", "Андрей", "Александр", "Антон",
                "Антонин", "Александр", "Алексий", "Олексий", "Александр",
                "Антон", "Андрий", "Андрей", "Андриян", "Андриан",
                "Алексей", "Антон", "Алексий", "Алексий", "Александр"
        };
        countUniqueWordsInArray(arrayOfWords);

    }

    public static void countUniqueWordsInArray(String[] input) {
        Arrays.sort(input);
        List<String> allWordsSorted = List.of(input);
        Set<String> uniqueWordsWithCount = new HashSet<>();
        for (String word : allWordsSorted) {
            uniqueWordsWithCount.add(word + " - " + Collections.frequency(allWordsSorted, word) + " раз");
        }
        System.out.println(uniqueWordsWithCount);

    }
}
