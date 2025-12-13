import java.util.Scanner;
public class Q5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int year=sc.nextInt();
        int month=sc.nextInt();
        if(year<0)
            System.out.println("Invalid");
        else if(month<1 || month>12){
            System.out.println("Invalid");

        }
        else{
            switch(month){
                case 1, 3,5,7,8,10,12:
                    System.out.println("31 days");
                    break;
                    case 4,6,9,11:
                        System.out.println("30 days");
                        break;
                        case 2:
                            if(year%4==0 && year%100!=0 )
                                System.out.println("29 days");
                            else if(year%400!=0){
                                System.out.println("29 days");
                            }
                            else
                                System.out.println("28 days");

            
        }
    }
    }}
