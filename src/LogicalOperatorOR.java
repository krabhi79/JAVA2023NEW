public class LogicalOperatorOR {
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a<b || a>b || a>c);
        System.out.println(a>c || a==c || b<c);
        System.out.println(a>=c || b<=a || b>c);
    }
}
