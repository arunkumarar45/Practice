package session2;

import java.util.Arrays;

class Movezerostoend{
    public static void mover(int[] arr){
        int nz=0;
        int z=0;
        while(nz<arr.length){
            if(arr[nz]!=0){
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }


        }
    }
        public static void main(String[] args){
            int[] ar={4,1,0,3,12};
            mover(ar);
            System.out.println(Arrays.toString(ar));
            }
    }
