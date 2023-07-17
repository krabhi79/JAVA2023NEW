public class StringMutableImmutable {
    public static void main(String []args){
        String name1 = "Abhishek";
        System.out.println(name1);
        name1.concat("Madhepura");
        System.out.println(name1);

        StringBuffer name2 = new StringBuffer("Mash");
        System.out.println(name2);
        name2.append("India");
        System.out.println(name2);


    }
}
