package session2;

import java.util.Arrays;

public class PrefixSum {
   public static void main(String[] args) {
        int[] arr={2,4,3,7,9};
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
