package Session1;
public class RecursionStackDemo {
    public static int factorial(int n){
        System.out.println("Calling factorial: "+n);
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(2));
    }
}