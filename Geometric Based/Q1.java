
import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            if(a==b && b==c)
    System.out.println("Its a Equilateral");
else if(a==b || a==c || b==c)
System.out.println("Its a Isosceles");
else
    System.out.println("Scalene");
        }
        else
        System.out.println("Invalid");
    }
}