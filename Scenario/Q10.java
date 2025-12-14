import java.util.Scanner;
public class Q10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.equals("Red")){
            System.out.println("Stop");
        }
        else if(str.equals("Yellow")){
            System.out.println("Watch");
        }
        else if(str.equals("Green")){
            System.out.println("Go");
        }
        else
            System.out.println("Not Allowing withdraw");

        }
    }