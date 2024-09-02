public class sum {
    public static void main(String[]args){
        int x=156;
        int b=0;
        while(x!=0){
            int a=x%10;
            b=b+a;
            x=x/10;
        }
        System.out.println("the sum is:"+b);
    }
}
