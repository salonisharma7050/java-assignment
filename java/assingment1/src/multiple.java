import java.util.Scanner;

public class multiple {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number= sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println("multiple is:" +(i*number));
        }
    }
}
