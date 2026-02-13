import java.util.Arrays;

public class SecodnLarge1 {

    public static int Secondlarge(int arr[]){
        int n= arr.length;
      Arrays.sort(arr);

      for(int i= n-2; i>=0; i--){
          if(arr[i]!=arr[n-1]){
            return arr[i];
          }
      }
      return -1;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,4,32,44,1,5,6,78};
        System.out.print("this is second large : "+Secondlarge(arr));
    }
}