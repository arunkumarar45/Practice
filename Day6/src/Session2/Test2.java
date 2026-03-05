package Session2;
//5.Island of Isolation: If an object is not referenced by any variable, it becomes an island of isolation. Such objects are eligible for garbage collection as they cannot be accessed or used in the program.
public class Test2 {
    
    Test2 ref;
    public static void main(String[] args) {
        Test2 t1=new Test2();
        Test2 t2=new Test2();
        t1.ref=t2;//t1 is referencing t2
        t2.ref=t1;//t2 is referencing t1
        //Now both t1 and t2 are referencing each other, creating a circular reference. However, since there are no external references to either t1 or t2, both objects become islands of isolation and are eligible for garbage collection.
        t1=null;//Nullifying the reference variable t1
        t2=null;//Nullifying the reference variable t2
    }
}
