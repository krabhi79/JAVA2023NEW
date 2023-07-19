public class ReverseStringCase2 {
    public static void main(String[] args) {
        String str1="Abhishek Mash";
        String str2="";
        String strr[]=str1.split(" ");
        for (int i= strr.length-1;i>=0;i--)
        {
            str2=str2+" "+strr[i];
        }
        System.out.println(str2);
    }
}
