import java.util.Scanner;
public class Q13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        double s= (2*(l*b+b*h+h*l));
        System.out.println("Surface is:" +s);
        double v=(l*b*h);
        System.out.println("Volume:" +v);
        double p=(4*(l+b+h));
        System.out.println("perimeter:" +p);

    }}
