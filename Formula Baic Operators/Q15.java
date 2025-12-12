import java.util.Scanner;
public class Q15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        double csa= ((2*3.14*r*h));
        System.out.println("Surface is:" +csa);
        double tsa=(2*3.14*r*(r+h));
        System.out.println("TCS" +tsa);
        double v=(3.14*r*r*h);
        System.out.println("Volume:" +v);
        double p=(2*3.14*r);

    }}
