import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if((n=='a' ||n=='e' || n=='i'||n=='o'||n=='u') ||(n=='A'||n=='I'||n=='O'||n=='U'||n=='E')){
            System.out.println("Vowels");
        }
        else{
            System.out.println("Consonant");
        }
    }
}