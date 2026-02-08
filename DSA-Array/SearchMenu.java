public class SearchMenu {
    public static int Menufound(String Menu[], String key){
        for(int i= 0; i<Menu.length; i++){
            if(Menu[i].equals(key)){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String Menu[]= {"samosa", "kachauri", "chhole", "phulki"};
        String key=  "chhole";
        int index= Menufound(Menu, key);
        if(index == -1){
            System.out.print("this Menu not availabale : ");
        }else{
            System.out.print("this is Menu position : "+index);
        }
    }
}
