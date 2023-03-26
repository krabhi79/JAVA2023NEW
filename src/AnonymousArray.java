public class AnonymousArray {
    public static void main(String[] args) {
        calcu obj =new calcu();
        int result= obj.add(new int[]{1,2,39,7,5,6,70,50});
        System.out.println(result);

    }
}
class calcu{
    public int add(int nums[]){
        int result=0;
        for (int n :nums)
        {
            result= result+n;
        }
        return result;
    }
}
