public class PalindromeProg2 {
    public static void main(String[] args) {
        String str1 ="HANNAH";
        String str2="";
        for (int i = str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        if (str1.equals(str2))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}