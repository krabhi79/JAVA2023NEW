import java.sql.SQLOutput;
import java.util.Scanner;
public class UserInput {
    public static void main(String [] args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int age =Scan.nextInt();
        System.out.println("age is " + age);
        System.out.println("Enter your name");
        String name = Scan.next();
        System.out.println("Name is " + name);
        System.out.println("Enter your city name");
        String city = Scan.next();
        System.out.println("City name is " + city);

    }
}
