package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class N1Exercici1 {
    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        names.add("Marcos");
        names.add("José");
        names.add("Elena");
        names.add("Olga");
        names.add("Natalia");

        IStringsFilter stringsFilter = () -> {
            for (String s : names) {
                if (s.toLowerCase().contains("o")) {
                    System.out.println(s);
                }
            }
        };

        stringsFilter.filter();
    }
}
