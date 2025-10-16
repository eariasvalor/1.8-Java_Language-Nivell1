package n1exercici3;

import common_classes.SampleMonths;

import java.util.List;

public class N1Exercici3 {
    public static void main(String[] args){
        List<String> months = SampleMonths.getMonths();

        months.forEach(month -> System.out.println(month));
    }
}
