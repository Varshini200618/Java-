import java.util.Scanner;
public class Q6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int temp=n;
        n=m;
        m=temp;
        System.out.println(m);
    System.out.println(n);
}
