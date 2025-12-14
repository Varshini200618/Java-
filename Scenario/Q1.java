import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double b=sc.nextDouble();
        double dis=0;
        if(b<1000){
            dis=b*0.05;
        }
        else if(b<=1000 && b<5000){
            dis=b*0.10;
        }
        else if(b>=5000){
            dis=b*0.20;
        }
        double finalprice=b-dis;
        System.out.println("Discount" +dis);
            System.out.println("finalprice" +finalprice);
        }
    }

