public class bankers {
    static int maxRegions(int n){
        int max=((n*(n+1))/2)+1;
        return max;
    }
    static int maxPieces(int cuts){
        return ((cuts*(cuts+1))/2)+1;
    }

    public static void main(String[] args){
        int n=5;
        int i = maxRegions(n);
        System.out.println(i);
        System.out.print(maxPieces(5));
    }
}
