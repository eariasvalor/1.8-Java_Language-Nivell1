package n1exercici5;

public class N1Exercici5 {
    public static void main(String[] args){
        IPiGetter piGetter = () -> 3.1415;

        System.out.println("The value of Pi is: " + piGetter.getPiValue());


    }

}
