package session3;

public class Finalize {
    protected void finalize(){//The finalize method is called by the garbage collector before an object is removed from memory. It can be used to perform cleanup operations or release resources before the object is destroyed.
        System.out.println("Finalize method called. Object is being garbage collected.");
    }
    public static void main(String[] args) {
        Finalize f1 = new Finalize();
        f1=null;//Nullifying the reference variable f1, making the object eligible for garbage collection.
        System.gc();//Requesting the JVM to perform garbage collection. However, it's important to note that this is just a request and the JVM may choose to ignore it.
        System.out.println("Finalize object is eligible for garbage collection.");
    }
    
    
}
