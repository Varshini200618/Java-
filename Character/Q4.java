import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n>='0' && n<='9'){
            System.out.println("digit");
        }
        else
            System.out.println("Not");
    }}