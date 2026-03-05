package Session2;

public class Test1 {
    void display(){
        Test1 t1=new Test1();
    }
    public static void main(String[] args) {
        Test1 t=new Test1();//C
        System.out.println(t);//Address of the object created at line C
        t.display();
        new Test1();//Object created inside the display method. This object is eligible for garbage collection after the display method execution is completed.
    }
    
}
