import java.util.Scanner;
public class odd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        number=sc.nextInt();
        if(number%2==0){
            System.out.println("no is even");
        }else{
            System.out.println("no is odd");
        }
    }
}
