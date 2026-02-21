package oops;
 class Student1{
    private int usn;
    private String email;
    public void setUsn(int usn){
        this.usn=usn;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public int getusn(){
        return this.usn;
    }
    public String getemail(){
        return this.email;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Student1 s1=new Student1();
        //s1.usn//No Access
        //use of setters
        s1.setUsn(101);
        s1.setEmail("ab@gmail.com");

        System.out.println(s1.getusn());
        System.out.println(s1.getemail());
    }

}
