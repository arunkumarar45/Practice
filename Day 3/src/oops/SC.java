package oops;

class simplecalulator {
    void add(int a,int b){
        System.out.println(a+b);
    }
}
class Advance extends simplecalulator{
    void Substact(int a,int b){
        System.out.println(a-b);
    }
}
class superadvance extends Advance{
    void multiply(int a,int b){
        System.out.println(a*b);
    }
}
public class SC {
public static void main(String[] args) {
    superadvance s1 = new superadvance();
    s1.add(2,3);
    s1.Substact(5,3);
    s1.multiply(2,3);

}
}
