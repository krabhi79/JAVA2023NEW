public class PalindromeProgram {
    public static void main(String[] args) {
        String name1 = "MADAM";
        String name2 = "";
        for (int i = name1.length()-1;i>=0;i--)
        {
            name2=name2+name1.charAt(i);
        }
        if (name1.equals(name2))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
