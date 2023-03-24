public class EnhansedForLoop {
    public static void main(String[] args) {
        int nums[][] = {{1, 2, 3, 4},
                {1, 2, 3, 3},
                {2, 5, 9}
        };
        for (int a[] : nums)
        {
            for (int b : a)
            {
                System.out.print(b);
            }
            System.out.println();
        }

    }
}
