package session3;

import java.net.SocketOption;

public class Majority {
    public static void main(String[] args){
        int[] arr={1,2,1,1,2,2,2,1,1,2,2};
        int majority=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
           if(count==0){
               majority=arr[i];
               }
              if(arr[i]==majority){
                  count++;
            }
              else{
                  count--;


              }

        }
        System.out.println(majority);
    }
}
