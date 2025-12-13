
import java.util.Scanner;
public class Q18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<10){
            System.out.println("Single digit");
        }
        else if(n<100){
            System.out.println("Two digit");
        }
        else
            System.out.println("Three digit");

    }
}

