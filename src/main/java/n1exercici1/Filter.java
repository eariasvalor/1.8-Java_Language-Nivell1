package n1exercici1;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public List<String> filterByLetter(List<String> list, String letter){
        return list.stream().filter(s -> s.toLowerCase().contains(letter)).collect(Collectors.toUnmodifiableList());

    }
}
