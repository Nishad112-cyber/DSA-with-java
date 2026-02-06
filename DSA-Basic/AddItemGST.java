import java.util.Scanner;
public class AddItemGST {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter pencil price : ");
        float Pencil= sc.nextFloat();
         System.out.print("enter pen price : ");
        float Pen= sc.nextFloat();
         System.out.print("enter eraser price : ");
        float Eraser= sc.nextFloat();
        sc.close();

        float Addition = ((Pencil)+(Pen)+(Eraser))+18%100;
        System.out.print("this is total bill = :"+Addition);

    }
}
