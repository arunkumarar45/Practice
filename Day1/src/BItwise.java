public class BItwise {
    public static void main(String[] args){
        System.out.println(5&6);
        System.out.println(10>>2);
        System.out.println(10<<2);
        System.out.println(~ 5);
        //POWER OF 2
        int n=4;
        if((n&(n-1))==0){
            System.out.println("po2");
        }
        else{
            System.out.println("not");
        }
    }
}
