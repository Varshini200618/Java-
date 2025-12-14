import java.util.Scanner;
public class Q6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
if(a==b && b==c && c==d){
            System.out.println("It is Square");
        }
        else if(a==c && b==d){
            System.out.println("It is rectangle");
        }
        else
            System.out.println("It is not shape");
    }
}