import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        double discount=sc.nextDouble();
        double finalprice=(price-(discount/100)*price);
        System.out.println(finalprice);

    }
}