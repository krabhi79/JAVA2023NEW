public class TernaryCondition2 {
    public static void main(String [] args){
        int marks1=50;
        int marks2=80;
        int marks3=90;
        String result=(marks1>marks2)?"true":"false";
        System.out.println(result);
        String res=(marks1>marks2)?(marks1>marks3?"true":"false"):(marks2>marks3?"true":"false");
        System.out.println(res);
    }
}
