import java.util.Scanner;
public class product {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int product=1;
        for(int i=1; i<=5; i++)
            product*=i;
        System.out.println("the product of number from 1 to 5 is:"+product);
    }
}
