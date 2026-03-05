package Session1;
import java .util.Scanner;

public class ArrayIndexWithoutThrow {
    static void fetchElement(int[] a,int index)throws ArrayIndexOutOfBoundsException{


            System.out.println(a[index]);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter an array: ");
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
