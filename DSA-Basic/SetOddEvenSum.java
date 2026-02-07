public class SetOddEvenSum {
    public static void main(String[] args) {
        int sumeven=0;
        int sumodd= 0;
        for(int i=0; i<=5; i++){
            if(i%2==0){
                 sumeven= sumeven+i;
                
            }else {
                sumodd= sumodd+i;
            }
        }
        System.out.println("sum of even number : " +sumeven);
        System.out.print("sum of odd number : " +sumodd);

    }
}
