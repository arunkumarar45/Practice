public class swap {
    static  void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args){
        int x=10;
        int y=20;
        swap(x,y);
        System.out.println(x+" "+y);//not swapped because of copies
    }
}
// swap using objects
/*class Number {
    int value;
}
    public class swap {
    static  void swap(Number n1, Number n2){
        int temp=n1.value;
        n1.value=n2.value;
        n2.value=temp;
    }
    public static void main(String[] args){
        Number a=new Number();
        Number b=new Number();
        a.value=10;
        b.value=20;
        swap(a,b);
        System.out.println(a.value+"  "+b.value);

    }
}
*/
// swap using arrays
/*public class swap {
    static void swap(int[] arr){
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }
    public static void main(String[] args){
        int x=10,y=20;
        System.out.println(x+"  "+y);
        int[] arr={x,y};

        swap(arr);
        x=arr[0];
        y=arr[1];
        System.out.println(x+"  "+y);
    }
}
*/