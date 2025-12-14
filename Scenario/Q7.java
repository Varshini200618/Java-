import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double bill=0;
        double surcharge=0;
        if(n<=100){
            System.out.println("Free");
        }
        else if(n<=300){
            bill=((n-100)*5);
            System.out.println(bill);}
            else{
                bill=((200*5)+(n-300)*10);

}
if(surcharge>500)
    surcharge=bill*0.10;



        double Total=bill+surcharge;
        System.out.println(Total);

        }
    }