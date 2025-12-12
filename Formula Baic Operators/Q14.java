import java.util.Scanner;
public class Q14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double s= (4*(3.14*r*r));
        System.out.println("Surface is:" +s);
        double v=((4/3)*3.14*r*r*r);
        System.out.println("Volume:" +v);

    }}
