import java.util.Scanner;
public class Condition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n>m){
            System.out.println("n is greater than m");
        }
        else
            System.out.println("n is not greater then m");
    }
}

