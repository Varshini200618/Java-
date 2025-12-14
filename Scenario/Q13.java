import java.util.Scanner;
public class Q13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(n<12){
            System.out.println("10");
        }
        else if(n<60)
            System.out.println("20");
        else if(n>=60)
            System.out.println("15");
        else
            System.out.println("Invalid");

        }
    }