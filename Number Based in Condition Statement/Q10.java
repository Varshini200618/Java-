import java.util.Scanner;
public class Q10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=n+m;
            if((sum&1)==0 )
            System.out.println("even");
        else
            System.out.println("No");
    }
}

