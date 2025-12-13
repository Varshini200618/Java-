import java.util.Scanner;
public class Q10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salary=sc.nextDouble();
        double pf=salary*0.08;
        double insurence=salary*0.05;
        double end=(salary - (pf + insurence));///8000+5000=13000-100000//870000;

System.out.println("Final amount of the salary is:" +end);
    }}
