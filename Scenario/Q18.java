import java.util.Scanner;
public class Q18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
        if (n<0) {
            System.out.println("Low Data");
        } 
        else if (n==50) {
            System.out.println("Half Consumed");
        } 
        else if (n>100) {
            System.out.println("Data Over");
        } 
        else {
            System.out.println("Data Available");
        }
        }
    }