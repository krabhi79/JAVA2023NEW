public class ConditionalStatementIfelse {
    public static void main(String[] args) {
       // int age = 17;
        //if (age >= 18) {
          //  System.out.println("You're an adult");
        //} else {
         //   System.out.println("You're still a kid");
        //}
        int age = 61;
        if(age>=18 && age<=60)
        {
            System.out.println("You're an adult now");
        }
        else if (age>60)
        {
            System.out.println("You're an old person");
        }
        else
        {
            System.out.println("You're still a kid");
        }
    }
}

