import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number : ");
        float number= sc.nextFloat();
        sc.close();
        if(number>=0){
            System.out.print("this is positve : "+number);
        }else{
            System.out.print("this is negative : "+number);
        }
    }
}
