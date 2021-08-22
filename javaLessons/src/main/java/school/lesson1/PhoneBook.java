package school.lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    // ключ - фамилия
    // значение - список телефонов
    private Map<String, List<String>> contents = new HashMap<>();

    public void get(String surname) {
        System.out.println("PhoneNumber(s) of " + surname + ": " + contents.get(surname));
    }

    public void add(String surname, String phoneNumber) {
        if (!contents.containsKey(surname)) {
            contents.put(surname, List.of(phoneNumber));
        } else {
            List<String> existingNumbers = contents.get(surname);
            List<String> newNumbers = new ArrayList<>(existingNumbers);
            newNumbers.add(phoneNumber);
            contents.put(surname, newNumbers);
        }
    }
}
