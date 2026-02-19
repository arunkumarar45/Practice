/*public class Unique {
        public static void main(String[] args){
            int[] arr={4,2,1,5,2,4,1};
            int res=0;
            for(int i=0;i<arr.length;i++){
                res=res^arr[i];
            }
            System.out.println(res);
        }
    }
*/
// Hamming weight//
 /*public class Unique {

       static  int hammingWeight(int n){
           int count=0;
           while(n>0){
               if((n&1)==1){
                   count++;

               }
               n=n>>1;
               }


           return count;
    }
      public static void main(String[] args){
           int n=11;
           System.out.println(hammingWeight(n));

      }
}
*/
//heart c=7,r=6
/*
public class Unique{
    public static void main(String[] args){
        for(int r=0;r<6;r++){
            for(int c=0;c<7;c++){
                if(r==0 && c%3 !=0 || r==1 && c%3==0 || r-c == 2 || r+c==8){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
*/
/*public class Unique{
    public static void main(String[] args){
        for(int r=0;r<6;r++){
            for(int c=0;c<7;c++){
                if(r==5 && c%3 !=0 || r==4 && c%3==0 || r-c == -3 || r+c==3){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}*/
// zig-zag
public class Unique{
    public static void main(String[] args){
        for(int r=1;r<=3;r++){
            for(int c=1;c<=13;c++){
                if(r==1 && c%4==3 || r==2 && c% 2==0 || r==3 && c%4==1 ){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

// pyramid
/*
public class Unique {
    public static void main(String[] args) {
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5 - r; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * r - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/