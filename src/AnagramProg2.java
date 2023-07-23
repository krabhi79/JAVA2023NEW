import java.util.Arrays;

public class AnagramProg2 {
    public static void main(String[] args) {
        String name1 = "ABhishek";
        String name2  = "shekabih";

        name1 =name1.toLowerCase();
        name2 =name2.toLowerCase();

        char [] ar1=name1.toCharArray();
        char [] ar2=name2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if (Arrays.equals(ar1,ar2))
        {
            System.out.println("Program is anagram");

        }
        else {
            System.out.println("Prog is not anagram");
        }

    }
}
