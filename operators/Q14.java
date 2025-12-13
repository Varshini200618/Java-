import java.util.Scanner;
public class Q14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double price=sc.nextDouble();//20
        double free=((n/5)*2);//10/5=2*2=4
        double paid=n-free;//10-4=6
        System.out.println(paid*price);//6*20=120
    }}
