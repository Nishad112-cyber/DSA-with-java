public class PrintPair {
    public static void Pairs(int number[]){
        int ts=0;
        for(int i=0; i<number.length; i++){
            int curr= number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("(" +curr+","+number[j]+ ")");
                ts++;
            }
            System.out.println();
        }
        System.out.print("this is total sum :"+ts);
    }
    public static void main(String[] args) {
        int number[]= {2,3,4,5,6,7,8,10};
        Pairs(number);
    }
}
