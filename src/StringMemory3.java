public class StringMemory3 {
    public static void main(String[] args) {
        String a1 = new String("Abhishek");
        String a2 = new String("Abhishek");
        String a3 = new String("AbhiShek");
        System.out.println(a1==a2);
        System.out.println(a2==a3);
        System.out.println(a3==a2);
        System.out.println(a1.equals(a2));
        System.out.println(a2.equalsIgnoreCase(a3));
        System.out.println(a3.equalsIgnoreCase(a1));
    }
}
