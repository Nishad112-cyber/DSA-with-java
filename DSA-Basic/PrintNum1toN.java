import java.util.Scanner;
public class PrintNum1toN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your number : ");
        int n= sc.nextInt();
        sc.close();
        int count= 1;
        while (count<=n) {
            System.out.print( count+",");
            count++;  
        } 
    }
    
}
