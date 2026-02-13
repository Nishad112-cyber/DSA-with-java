public class Secondlarge3 {
    public static int secondlrge(int arr[]){
        int lagrge= -1; int secondlarge=-1;
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]>lagrge){
                secondlarge= lagrge;
                lagrge= arr[i];

            }else if(arr[i]<lagrge && arr[i] >secondlarge){
                secondlarge= arr[i];
            }
        }
        return secondlarge;

    }
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,8,64,32,24};
        System.out.print("second large : "+secondlrge(arr));                            
    }
}
