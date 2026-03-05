package session2;
import java.util.Arrays;
public class Rotateelementsbyd {
    public static void reverse(int[] arr,int start,int end){
        int st=start;
        int en=end;
        while(st<en){
            int temp=arr[st];
            arr[st]=arr[en];
            arr[en]=temp;
            st++;
            en--;
        }
        
    }
    public static void rotate(int[] arr,int d){
        if(d==0){
             return;

        }
        else if(d<0){
            d=d+arr.length;
        }
       d=d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
  public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int d=3;
        rotate(arr,d);
        System.out.println(Arrays.toString(arr));
        
    }
}
