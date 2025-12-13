import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n/10){
            case 10,9,8:
                System.out.println("A");
                break;
case 7:
                System.out.println("B");
                break;
case 5,6:
                System.out.println("C");
                break;
                default:
                    System.out.println("Fail");


        }
    }}