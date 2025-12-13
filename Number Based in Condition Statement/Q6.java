import java.util.Scanner;
public class Q6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int h=sc.nextInt();
        if(n>=m && n>=h){
            System.out.println("n is greatest number");
        }
        else if(m>=h){
            System.out.println("m is greatest number");
        }
        else
            System.out.println("h is greastest number");

    }
}

