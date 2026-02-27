package session3;
class Parent{
    final void show(){
        System.out.println("Parent class");

    }
}
class child extends Parent{
    void show1(){
        System.out.println("child class");
    }
}

public class Finalmethod {
    public static void main(String[] args){
        Parent c=new child();
        c.show();
    }

}
