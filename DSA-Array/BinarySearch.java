public class BinarySearch {
   public static int Search(int num[], int key){
    int start= 0,end=num.length;
    int mid= (start+end)/2;
    for(int i=0; i<num.length; i++){
        if(num[mid]==key){
            return mid;
        }
        if(num[start]<mid){
            mid++;
        }else{
            mid--;
        }
    }
    return -1;
   } 
   public static void main(String[] args) {
    int num[]= {1,2,43,43,33,244,223};
    int key= 33;
    int getnum= Search(num, key);
         System.out.print("this is key position :"+getnum);
   }
}
