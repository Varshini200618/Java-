import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int h=sc.nextInt();
        if(n<=m && n<=h){
            System.out.println("n is smallest number");
        }
        else if(m<=h){
            System.out.println("m is smallest number");
        }
        else
            System.out.println("h is smallest number");

    }
}

