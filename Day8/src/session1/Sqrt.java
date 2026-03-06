package session1;

public class Sqrt {
        public static int mySqrt(int x) {
            if(x==0 || x==1){
                return x;
            }
            int l=1,h=x,ans=0;
            while(l<=h){
                int mid=l+(h-l)/2;
                if((long)mid*mid==x){
                    return mid;
                }
                else if((long)mid*mid<x){
                    ans=mid;
                    l=mid +1;
                }
                else{
                    h=mid-1;
                }
            }
            return ans;
        }

    public static void main(String[] args){
        int x=16;
        System.out.println(mySqrt(x));

    }
}
