public class Wrapper {
    public static void main(String[] args){
        int x=20;
        Integer object=Integer.valueOf(x);//boxing
        int y=10;
        Integer o=y;//autoboxing
        System.out.println(object);
        System.out.println(o);
        Integer obj3=Integer.valueOf(50);
        int z=obj3.intValue();//unboxing
        Integer obj4=Integer.valueOf(40);
        int b=obj4;//autounboxing
        System.out.println(z);
        System.out.println(b);
        char[] letters={'A','r','u','n'};
        String sc=new String(letters);
        System.out.println(sc);
        //string to int
        String str="123";
        int n=Integer.parseInt(str);
        System.out.println(n*2);
        String s2=Integer.toString(n);
        System.out.println(s2+"abc");
    }
}
