import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=n-m;
        if(sum%2==0){
            System.out.println("n is even");
        }
        else
            System.out.println("n is odd");
    }
}

