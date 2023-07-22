import java.util.Arrays;

public class AnagramProg1 {
    public static void main(String[] args) {
        String name1="Abhishek kumar";
        String name2="Ishekbha marku";

        name1=name1.replace(" ","");
        name2= name2.replace(" ","");

       name1= name1.toLowerCase();
       name2= name2.toLowerCase();

       char []str1= name1.toCharArray();
       char []str2= name2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if (Arrays.equals(str1,str2))
        {
            System.out.println("It an anagram");
        }
        else {
            System.out.println("Its not an anagram");
        }
    }
}
