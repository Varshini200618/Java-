import java.util.Scanner;
public class Q14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(n<100){
            System.out.println("Limited Speed");
        }
        else if(n>=100)
            System.out.println("Not Limited Speed");
        else
            System.out.println("Invalid");

        }
    }