package n1exercici4;

import common_classes.SampleMonths;

import java.util.List;

public class N1Exercici4 {
    public static void main(String[] args){
        List<String> months = SampleMonths.getMonths();

        months.forEach(System.out::println);
    }
}
