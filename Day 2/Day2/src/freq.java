public class freq {
    public static void main(String[] args){
        int[] arr={1,2,3,4,1,2};
        freqele(arr);

    }
    static void freqele(int[] arr){
        int xorAll=0;
        for(int i=0;i<arr.length-1;i++){
            xorAll=xorAll^arr[i];
        }
        int rsb=xorAll&-xorAll;
        int n1=0;
        int n2 = 0;
        for(int i = 0; i<= arr.length -1; i++){
            if((arr[i]&rsb)!=0){
                n1^=arr[i];
            }
            else{
                n2^=arr[i];
            }
        }
        System.out.println("n1:"+n1+",n2:"+n2);
    }
}
