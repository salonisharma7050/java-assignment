import java.util.Scanner;

public class sqareroot {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no for square root" );
        double number= sc.nextInt();
        double sq=Math.sqrt(number);
        System.out.println(sq);

    }
}
