
import java.util.Scanner;
public class Q19{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=n*m;
        if(s>0){
            System.out.println("Positive");
        }
        else
            System.out.println("Negative");
    }}
