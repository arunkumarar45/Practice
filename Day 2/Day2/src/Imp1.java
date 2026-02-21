public class Imp1 {
    static int solve(int n,int k){
        if(n==1){
            return 0;
        }
        return (solve(n-1,k)+k)%n;
    }
    static int findWinner(int n,int k){
        return solve(n,k)+1;
    }
    public static void main(String[] args)
    {
        System.out.println(findWinner(5,2));

    }
}
