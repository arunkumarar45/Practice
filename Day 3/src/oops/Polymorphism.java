package oops;
public class Polymorphism {
    void add(int a,int b){
        System.out.println(a+b);
    }
     void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
     void add(float a,float b){
        System.out.println(a+b);
    }
     void add(double a,double b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        Polymorphism a=new Polymorphism();
        a.add(2,3);
        a.add(2,3,4);
        a.add(2.1f,2.1f);
        a.add(1.1,2.2);

    }
}
