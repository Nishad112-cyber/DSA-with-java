import java.util.*;
public class ALsum2 {
    public static boolean sum2(ArrayList<Integer>list, int target){
        int lp= 0; int rp= list.size()-1;

        while(lp!=rp){
            // case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(12);
        list.add(15);
        list.add(16);
        list.add(8);
        list.add(9);
        list.add(7);

        System.out.println(sum2(list, 25));
    }
    
}

