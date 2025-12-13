import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

if(n%100==0){
    System.out.println("It is century year");
}
else if(n%400!=0){
    System.out.println("It is not ");
}
    }}
