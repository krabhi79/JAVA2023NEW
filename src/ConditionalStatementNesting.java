public class ConditionalStatementNesting {
    public static void main(String [] args){
        int mark =99;
        if(mark>30 && mark<=100)
        {
            if (mark > 30 && mark <= 40)
            {
                System.out.println("Your marks is in b/w 30-40");
            }
            else if(mark>40 && mark<=50)
            {
            System.out.println("Your marks is in b/w 40-50");
            }
            else if(mark>50 && mark<=60)
            {
                System.out.println("Your marks is in b/w 50-60");
            }
            else if(mark>60)
            {
                System.out.println("Your marks is in b/w 60-100");
            }
        }
        else if (mark==30)
        {
            System.out.println("You are just passed in the subject");
        }
        else
        {
            System.out.println("You are failed");
        }

    }
}
