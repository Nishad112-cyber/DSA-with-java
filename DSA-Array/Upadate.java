import java.util.Scanner;
public class Upadate {
public static void upadateArr(int marks[]){
    for(int i=0; i<marks.length; i++){
        marks[i]= marks[i]+5;
    } 
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int marks[] = new int[5];
    System.out.print("enter your marks");
    for(int i=0; i<marks.length; i++){
        marks[i]= sc.nextInt();
        sc.close();
}
      upadateArr(marks);
      System.out.print("upadated marks : ");
      for(int i=0; i<marks.length; i++){
        System.out.print(" "+marks[i]);
         
      }
    }
    
    
}