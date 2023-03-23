public class Array2D {
    public static void main(String[] args) {
       // int numbers [][]=new int[3][2];
//       numbers [0][0]=5;
//        numbers [0][1]=4;
//        numbers [1][0]=6;
//        numbers [1][1]=8;
//        numbers [2][0]=7;
//        numbers [2][1]=1;
        int numbers[][]={
                {5,4,5},
                {6,8,5,9},
                {7,5}
        };
        for (int i=0;i<=2;i++)
        {
           for (int j=0;j<numbers[i].length;j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
