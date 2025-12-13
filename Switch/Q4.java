import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        switch(month){
            case 12,1,2://Winter (Dec-Feb)
                System.out.println("Winter");
                break;
        case 3,4,5://Spring (Mar-May)
        System.out.println("Spring");
        break;
        case 6,7,8://Summer (Jun-Aug)
        System.out.println("Summer");
        break;
        case 9,10,11://Autumn(sep-nov)
        System.out.println("Autumn");
        break;
    
                
                default:
                    System.out.println("Null");


        }
    }}