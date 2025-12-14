import java.util.Scanner;
public class Q9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double withdraw=sc.nextDouble();
        double balance=5000;
        if(withdraw<=balance){
            withdraw=balance*100;
            System.out.println("Allowing withdraw");
        }
        else
            System.out.println("Not Allowing withdraw");

        }
    }