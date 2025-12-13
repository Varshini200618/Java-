import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int ft=n%100;
int lt=m%100;
if(ft==lt)
    System.out.println("Equal");
else 
    System.out.println("It is not ");

    }}
