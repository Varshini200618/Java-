import java.util.Scanner;
public class Q17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double bill=0;
        if(n<=1000){
            bill=0;
        }
        else if(n<=3000){
            bill=((n-1000)/1000.0)*5;
        }
            else if(n>3000){
                bill=((2*5)+((n-3000)/1000.0)*10);

}
System.out.println(bill);

        }
    }