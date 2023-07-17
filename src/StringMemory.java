public class StringMemory {
    public static void main(String[] args) {
        String a1 = "Abhishek";
        String a2 = "Abhishek";
        System.out.println(a1==a2);

        String a3 = new String("Abhishek");
        String a4 = new String("Abhishek");
        System.out.println(a3==a4);
    }
}
