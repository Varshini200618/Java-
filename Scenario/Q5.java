import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(n>=100){
            System.out.println("Fever");
        }
        else if(n<=90){
            System.out.println("Not Fever");
        }
        else
            System.out.println("Invalid Input");
        

        }
    }