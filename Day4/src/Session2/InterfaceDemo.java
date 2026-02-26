package Session2;
interface Human{
    void infor();
    default void identity(){
        System.out.println("Gangadar");
    }
}
interface Shaktiman {
    void ene();

    default void iden() {
        System.out.println("Gangadar");
    }
}
class Spiderman implements Human,Shaktiman{

    @Override
    public void infor() {

    }

    @Override
    public void ene() {

    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
         Human h=new Spiderman();

         h.identity();
    }
}
