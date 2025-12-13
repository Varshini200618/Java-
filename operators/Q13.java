import java.util.Scanner;
public class Q13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double price=sc.nextDouble();//20
        double free=n/4;//10/4=2.5
        double paid=n-free;//10-2.5=7.5
        System.out.println(paid*price);//7.5*20=150
    }}
