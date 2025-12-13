import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n>='A'){
            System.out.println("Alphabet");
        }
        else
            System.out.println("Not");
    }}