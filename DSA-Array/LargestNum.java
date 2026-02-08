public class LargestNum {

    public static void GetLarge(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(number[i]>largest){
              largest= number[i] ;
            }
            if(number[i] <smallest){
                smallest= number[i];
               
            } 
               
        }
          System.out.println("this is smallest number :"+smallest); 
          System.out.print(" this is largest number :" +largest);
    }
    
    public static void main(String[] args) {
        int number[]= {12,34,31,786,433,23,564};
        GetLarge(number);

            
    }
}
