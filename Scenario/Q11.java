import java.util.Scanner;
public class Q11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double dis=0;
        if(n<=1000){
            dis=n*0.05;
        }
        else if(n<=5000){
            dis=n*0.10;
        }
            else{
dis=n*0.20;

}
double Total=n-dis;
System.out.println(Total);

        }
    }