package Session1;
import java .util.Scanner;

public class ArrayIndex {
    static void fetchElement(int[] a,int index)throws ArrayIndexOutOfBoundsException{
        if(index<0||index>=a.length){
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }
        else{
            System.out.println(a[index]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter an Index: ");
        int index = sc.nextInt();
        try {
            fetchElement(a, index);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: "+e.getMessage());

        }
        finally {
            System.out.println("prog Ended");

        }

    }
}
