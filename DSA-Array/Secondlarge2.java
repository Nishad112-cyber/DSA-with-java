public class Secondlarge2 {
    public static int SecondLarge(int arr[]){
        int largest= -1, secondlarge= -1;
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                largest= arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] > secondlarge && arr[i]!= largest){
                secondlarge=arr[i];
            }
        }
        return secondlarge;
    }
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,8,64,32,24};
        System.out.print("second large : "+SecondLarge(arr));
    }
}
