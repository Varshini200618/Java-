import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
if(x>0 && y>0){

    System.out.println("Its a 1st Quadrant");
}
else if(x<0 && y>0){

    System.out.println("Its a 2nd Quadrant");
}
else if(x<0 && y<0){

    System.out.println("Its a 3rd Quadrant");
}
else if(x>0 && y<0){

    System.out.println("Its a 4th Quadrant");
}
else if(x==0 && y!=0){

    System.out.println("Its a on Y-Axis");
}
else if(x!=0 && y==0){

    System.out.println("Its a on X-Axis");
}
else if(x==0 && y==0){

    System.out.println("Its a Origin point");
}
else
    System.out.println("Its a not Triangle");
}
        
    }
