public class ReverseStringCases {
    public static void main(String[] args) {
        String name1= "Abhishek";
        String name2 = "";
        for (int i=name1.length()-1;i>=0;i--)
        {
         name2 = name2 + name1.charAt(i);
        }
        System.out.println("Before reversing " + name1);
        System.out.println("After reversing " + name2);

    }
}
