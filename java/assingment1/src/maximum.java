import java.util.Scanner;
public class maximum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the first no");
        a=sc.nextInt();
        System.out.println("enter the second no");
        b=sc.nextInt();
        System.out.println("enter the third no");
        c=sc.nextInt();
        if(a>=b &&a>=c){
            System.out.println("a is greater");
        } else if (b>=a &&b>=c) {
            System.out.println("b is greater");

        }else if(c>=a &&c>=b){
            System.out.println("c is greater");
        }

    }
}
