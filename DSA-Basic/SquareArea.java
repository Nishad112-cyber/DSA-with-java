import java.util.Scanner;
public class SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the side of square : ");
        int a= sc.nextInt();
        sc.close();
        int Area= a*a;
        System.out.println("this is square area : "+Area);
    }
}
