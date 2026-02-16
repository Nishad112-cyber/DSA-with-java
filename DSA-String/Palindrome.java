
public class Palindrome {
    public static boolean Checkpalindrome(String str){
        int n=  str.length();
        for(int i= 0; i<str.length()/2; i++){
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str= "racecarr";
        if(Checkpalindrome(str)){
            System.out.print("this is palindrome");
        }else{
            System.out.println("this is not a palindrome ");
        }
    }
}
