package oops;
//constructor chaining
public class cc {
    int id;
    String name;
    double salary;
    static String company="TCS";
    cc(){
        this(0,"Not Assigned",0.0);

    }
    public cc(int id,String name){
        this(id,name,30000);
    }
    public cc(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Id: "+id+" ,Name: "+name+" ,Salary: "+salary);
    }
    public static void main(String[] args){
        cc c1=new cc();
        cc c2=new cc(1,"hi");
        cc c3=new cc(2,"arun",45000);
        c1.display();
        c2.display();
        c3.display();
    }
}
