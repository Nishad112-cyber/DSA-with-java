public class SubArrray {
    public static void SubArr(int number[]){
        int currsum= 0;
        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(number[k]+" ");
                   
                }
                 currsum++;

                System.out.println();
                
            }
            System.out.println();
             
        }
        System.out.print("total sub array : "+currsum);
    }
    public static void main(String[] args) {
        int number[]= {1,2,3,4,5,6,7,8,9};
        SubArr(number);
    }
}
