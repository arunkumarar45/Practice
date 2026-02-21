package oops;
class Person1{
    String name;
    Person1(String name){
        this.name=name;
    }
}
class Student2 extends Person1{
    int rollNo;
    Student2(int rollNo,String name){
        super(name);//super keyword used to point parent class //super.something is used as method or variable from parent class dont use it in constructor

        this.rollNo=rollNo;
    }
    void display(){
        System.out.println(rollNo+" "+name);
    }
}
public class Inheritence {
    public static void main(String[] args){
        Student2 s=new Student2(1,"Arun");
        s.display();

    }
}
