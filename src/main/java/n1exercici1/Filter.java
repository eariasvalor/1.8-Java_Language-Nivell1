package n1exercici1;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public List<String> filterByLetter(List<String> list, String letter){
        if (list == null || letter == null || letter.isEmpty()) {
            throw new IllegalArgumentException("The list or the letter cannot be empty.");
        }
        String lowerLetter = letter.toLowerCase();
        return list.stream().filter(s -> s.toLowerCase().contains(lowerLetter)).collect(Collectors.toUnmodifiableList());

    }
}
