public class SubArrSum {
    public static void PrefixSum(int number[]){
        int maxsum= Integer.MIN_VALUE;
        int currsum=0;

        int prefix[] =new int[number.length];
        prefix[0]= number[0];

        for(int i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1] +number[i];
        }

        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                currsum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];

                if(maxsum<currsum){
                    maxsum= currsum;
                }
            }
        }
        System.out.print(" maximum sum : "+maxsum);
    }
     public static void main(String[] args) {
        int number[]= {1,-2,6,-1,3};
        PrefixSum(number);
    }
}
