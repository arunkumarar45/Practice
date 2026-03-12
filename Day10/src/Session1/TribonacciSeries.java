package Session1;

public class TribonacciSeries {
    public static int trib(int n){
        if(n==0 || n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        return trib(n-3)+trib(n-2)+trib(n-1);
    }
    public static void main(String[] args) {
        System.out.println(trib(5));
    }
}
