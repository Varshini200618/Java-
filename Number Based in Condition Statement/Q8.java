import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ld=n%10;
            if(ld%3==0)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}

