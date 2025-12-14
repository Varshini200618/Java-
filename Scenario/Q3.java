import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(n<=30){
            System.out.println("not  Senior Citizen");
        }
        else if(n>=60){
            System.out.println("Senior Citizen");
        }
        else
            System.out.println("Invalid Input");

        }
    }

