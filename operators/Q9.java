import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principle=sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();
        double totalprinciple=((principle*rate*time)/100);
System.out.println("Final amount of the interest is:" +totalprinciple);
    }}
