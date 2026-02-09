public class ReverseArray {
    public static void Reverse(int number[]){
        int first= 0, last= number.length-1;
        for(int i=0; i<number.length; i++){
            if(first<last){
                int swap= number[last];
                number[last]= number[first];
                number[first]= swap;
                first++;
                last--;
            }
        }
    }
    public static void main(String[] args) {
        int number[]= {1,2,3,4,5,6,7,8,9};
          Reverse(number);
           System.out.print("this is reverse number :");
        for(int i=0; i<number.length; i++){
           
            System.out.print(" ,"+number[i]);
        }
        System.out.println();
    }
}
