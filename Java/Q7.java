import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        n=n+m;//10-20=30
        m=n-m;//30-20=10
        n=n-m;//30-10=20
        System.out.println(m);
    System.out.println(n);
}
