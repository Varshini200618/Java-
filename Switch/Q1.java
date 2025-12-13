import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println(n+m);
                break;
case '-':
                System.out.println(n-m);
                break;
case '*':
                System.out.println(n/m);
                break;
case '/':
                System.out.println(n*m);
                break;
case '%':
                System.out.println(n%m);
                break;
                default:
                    System.out.println("Null");


        }
    }}