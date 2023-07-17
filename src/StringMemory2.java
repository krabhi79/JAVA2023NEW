import java.sql.SQLOutput;

public class StringMemory2 {
    public static void main(String[] args) {
        String n1 = "Abhishek";
        String n2 = "Abhishek";
        String n3 = "ABHISHEK";
        String n4 = new String("Abhishek");
        System.out.println(n1==n3);
        System.out.println(n1.equals(n4));
    }
}
