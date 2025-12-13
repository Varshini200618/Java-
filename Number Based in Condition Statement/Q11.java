import java.util.Scanner;
public class Q11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n/100;
        if(s%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}