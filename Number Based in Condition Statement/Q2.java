import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n<m){
            System.out.println("n is smallest m");
        }
        else
            System.out.println("n is not smallest then m");
    }
}

