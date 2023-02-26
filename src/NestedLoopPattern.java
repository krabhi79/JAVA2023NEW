public class NestedLoopPattern {
    public static void main(String [] args){
        int d = 12;
        for (int i=0;i<d;i++)
        {
            for (int j = 0; j < d; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
