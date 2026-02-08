public class LinearSearch {
    public static int Search(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]= {5,6,8,3,9,12,3};
        int key= 9;
        int index= Search(number, key);
        if(index == -1){
            System.out.print("index not found : ");
        }else{
            System.out.print("the index is = : "+index);
        }
    }
}
