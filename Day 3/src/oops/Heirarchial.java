package oops;
class User{
    void role(){
     System.out.println("Genric user");
    }
}

class Admin extends  User{
    @Override
    void role(){
        System.out.println("Admin User");
    }
}
class Guest extends Admin{
    @Override
    void role(){
        System.out.println("Guest User");
    }
}
public class Heirarchial {
    public static void main(String[] args){
        User u1=new User();
        User u2=new Admin();
        User u3=new Guest();
        u1.role();
        u2.role();
        u3.role();

    }
}
