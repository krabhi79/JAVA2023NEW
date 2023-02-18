public class IncrementationDecrementation2 {
    public static void main(String []args){
        int a= 6;
        int b= a++ + --a + ++a + --a + ++a ;
        System.out.println(a);
        System.out.println(b);
    }
}
