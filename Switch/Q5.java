import java.util.Scanner;
public class Q5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=100000;
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("balance:" +balance);;
                break;
                case 2:
                    int withdraw=sc.nextInt();
                    if(withdraw<=balance)
                    balance=balance-withdraw;
                System.out.println(balance);
                break;
                case 3:
                    int deposit=sc.nextInt();
                    deposit=balance+deposit;
                    System.out.println(deposit);
                    break;
                    default:
                        System.out.println("Null");
  }
    }}