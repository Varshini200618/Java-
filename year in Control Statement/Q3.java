import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ft=n%100;
int lt=n/100;
if(ft==lt)
    System.out.println("Equal");
else 
    System.out.println("It is not ");

    }}
