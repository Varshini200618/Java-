import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double pin=1234;
        if(n==pin){
            System.out.println("Allowing withdraw");
        }
        else if(n!=pin)
            System.out.println("Not Allowing withdraw");
        else
            System.out.println("Invalid Input");

        }
    }