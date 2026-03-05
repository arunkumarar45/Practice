package session3;

public class Request {
    public static void main(String[] args) {
        Request r1 = new Request();//
        r1=null;//
        System.gc();//Requesting the JVM to perform garbage collection. However, it's important to note that this is just a request and the JVM may choose to ignore it.
        System.out.println("Request object is eligible for garbage collection.");
    }
    
}
