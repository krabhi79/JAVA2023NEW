public class ReverseStringCase3 {
    public static void main(String[] args) {
        String name= "Abhishek Mash";
        String name1="";
        String arr[]=name.split(" ");
        for (String elem:arr)
        {
            for (int i = elem.length() - 1; i >= 0; i--)
            {
                name1 = name1 + elem.charAt(i);

            }
            name1=name1+" ";
        }
            System.out.println("Before reversing " +name);
        System.out.println("After reversing " + name1);
//        for (int i=name.length()-1;i>=0;i--)
//        {
//            name1=name1+name.charAt(i);
//        }
//        System.out.println(name1);
    }
}
