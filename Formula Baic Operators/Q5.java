import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double x=sc.nextInt();
    double x1=sc.nextInt();
    double y=sc.nextInt();
    double y1=sc.nextInt();
    double m=Math.sqrt(Math.pow(x-x1, 2) + Math.pow(y-y1, 2));
        System.out.println("Distance of the point is:" +m );
    }
}