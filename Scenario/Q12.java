import java.util.Scanner;
public class Q12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(n<10){
            System.out.println("Cold");
        }
        else if(n<25)
            System.out.println("pleasant");
        else if(n<35)
            System.out.println("Hot");
        else if(n>35)
            System.out.println("Heatwave");
        else
            System.out.println("Invalid");

        }
    }