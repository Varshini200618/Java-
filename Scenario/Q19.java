import java.util.Scanner;
public class Q19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(n<=20){
            System.out.println("Low Battery");
        }
        else if(n<=50){
            System.out.println("Consumed");
        }
        else if(n<=100){
            System.out.println("Battery Full");
        }
        else
            System.out.println("Invalid Input");
        

        }
    }

