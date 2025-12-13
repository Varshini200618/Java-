import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
                if(n>='A' && n<='Z') {
            System.out.println("uppercase");
        }
        else if(n>='a' && n<='z'){
            System.out.println("lowercase");
        }
        else if(n>=0 && n<=9){
            System.out.println("digit");
        }
        else{
            System.out.println("special character");
        }
    }
}