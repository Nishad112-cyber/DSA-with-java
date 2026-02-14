public class moveZero1 {

    public static void move(int arr[]){
        int n= arr.length;
        int temp[]= new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                temp[j++]= arr[i];
            }
        }
        for(int i=0; i<n; i++){
            arr[i]= temp[i];
        }
        while (j<n) {
            arr[j++]= 0;
        } 
    }
    public static void main(String[] args) {
        int arr[]= {1,2,0,7,0,5,0,3};
        move(arr);
        for(int num :arr){
        System.out.print(" "+num);
    }
}
}