package n1exercici7;

import common_classes.SampleThings;

import java.util.List;

public class N1Exercici7 {
    public static void main(String[] args){
        List<Object> things = SampleThings.getThings();

        things.stream()
                .filter(e -> e instanceof  String)
                .map(e -> (String) e)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .forEach(System.out::println);
    }
}
