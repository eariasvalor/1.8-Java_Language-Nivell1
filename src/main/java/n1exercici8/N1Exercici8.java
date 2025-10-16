package n1exercici8;

public class N1Exercici8 {
    public static void main(String[] args) {
        IReversion reversion = (s) -> {
            return s.chars()
                    .mapToObj(c -> (char) c)
                    .reduce("", (str, c) -> String.valueOf(c) + str, (s1, s2) -> s2 + s1);
        };

        System.out.print(reversion.reverse("rehtsE"));
    }
}
