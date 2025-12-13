import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        char m=sc.next().charAt(0);
        if(n==m){
            System.out.println("Equal");
        }
        else
            System.out.println("Not");
    }}