public class Jagged {
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{1,2,3},{3}};
        for(int[] num:arr){
            for(int n:num){
                System.out.print(n+" ");
            }
            System.out.println();
        }

    }
}
