import java.util.Scanner;
public class Sumof1toNum {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.print("enter your number : ");
        int n= sc.nextInt();
        sc.close();
        int sum=0;
        int count= 1;
        while (count <= n) {
            sum= sum+count;
            count++;
        }
        System.out.print("sum of all number :"+sum);
      
    }

}