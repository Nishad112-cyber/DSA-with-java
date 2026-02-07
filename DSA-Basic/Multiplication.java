import java.util.Scanner;
public class Multiplication {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your number : ");
    int number= sc.nextInt();
    sc.close();
    int i=1;
    int multipliction= 1;
    while (i<=10) {
        multipliction= i*number;
        i++;
      System.out.print(multipliction+" , ");
    }
      
}
}
