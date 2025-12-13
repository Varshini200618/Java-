import java.util.Scanner;
public class Q12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ld=n%10;
        if(ld%2==0){
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }
}