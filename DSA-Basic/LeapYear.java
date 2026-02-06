import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        sc.close();
        System.out.print("enter year : ");
        int year = sc.nextInt();
         boolean x= (year%4) == 0;
         boolean y= (year%100) !=0;
         boolean z= (year%400) == 0;
          if(x && y || z){
            System.out.print("this is leap year : ");
          }else{
            System.out.print("this is not a leap year :");
          }
    }
}
