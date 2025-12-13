
import java.util.Scanner;
public class Q17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=n%10;
        int k=m%10;
        if(s==k){
            System.out.println("Same");
        }
        else
            System.out.println("Not same");
    }}
