package n1exercici2;

import common_classes.SampleNames;

import java.util.List;

public class N1Exercici2 {
    public static void main(String[] args){
        List<String> names = SampleNames.getNames();
        Filter filter = new Filter();
        List<String> filteredList = filter.filterByLetterAndLength(names, "o");

        filteredList.forEach(System.out::println);


    }
}

