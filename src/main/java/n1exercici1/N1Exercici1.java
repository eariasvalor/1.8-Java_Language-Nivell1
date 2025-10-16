package n1exercici1;

import common_classes.SampleNames;

import java.util.List;

public class N1Exercici1 {
    public static void main(String[] args){

        List<String> names = SampleNames.getNames();

        Filter filter = new Filter();
        List<String> filteredList = filter.filterByLetter(names, "o");

        filteredList.forEach(System.out::println);

    }
}
