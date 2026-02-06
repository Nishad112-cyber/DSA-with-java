import java.util.Scanner;
public class NumberAvg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("input number a :");
        int a= sc.nextInt();
        System.out.print("input number a :");
        int b= sc.nextInt();
        System.out.print("input number a :");
        int c= sc.nextInt();
        int AVG= (a+b+c)/3;
        sc.close();
        System.out.println("this is average : "+AVG);

    }
}
