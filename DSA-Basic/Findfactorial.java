import java.util.Scanner;
public class Findfactorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your number : ");
        int n= sc.nextInt();
        sc.close();
        int factorial=1;
       int  count = 1;
        while (n>=count) {
            factorial= factorial*count;
          count++;
        }
        System.out.println(factorial);
    }
}
