public class palindrome {
    public static void main(String[]args){
        int x=121;
        int y=x;
        int b=0;
        while(x!=0){
            int a=x%10;
            b=(b*10)+a;
            x=x/10;
        }
        if(b==y){
            System.out.println("it is palindrome number");
        }else{
            System.out.println("it id not palindrome number");
        }

    }
}
