import java.util.Scanner;
public class integers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
                int sum=0;
                int number;
        System.out.println("enter number for sum");
        while(true){
            number= sc.nextInt();
            if(number==0){
                break;
            }
            sum+=number;
        }
        System.out.println("the sum of the number is :"+sum);
    }
}
