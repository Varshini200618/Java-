import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(n<18){
            System.out.println("Not eligible to vote");
        }
        else if(n>=18){
            System.out.println("Eligible to vote");
        }
        else
            System.out.println("Invalid Input");

        }
    }

