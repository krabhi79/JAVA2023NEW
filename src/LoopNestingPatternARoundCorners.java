public class LoopNestingPatternARoundCorners {
    public static void main(String [] args){
        int m=9;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                if (i==0 && j>0 && j<(m-1)/2 || j==0 && i>0 || i==(m-1)/2 && j<=(m-1)/2  || j==(m-1)/2 && i>0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
