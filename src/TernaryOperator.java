public class TernaryOperator {
    public static void main(String [] args){
        int a = 10;
        int b =20;
        int c = 40;
       // String res =(a>b)?"True" :"False";
        //System.out.println(res);
         //String result=(a<b)?"a is less":"b is less";
       // System.out.println(result);
       // int resultt=(a<b)?(a<c?a:b) :(b<c?b:c);
       // System.out.println(resultt);
        if(a<b)
        {
            if(a<c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else
        {
            if(b<c)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(b);
            }
        }


    }
}
