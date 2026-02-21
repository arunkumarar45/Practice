package oops;

public class S1 {

    int USN;
    String name;
    int marks;
    static String college="SCE";
     S1(int USN,String name,int marks){
         this.USN=USN;
         this.marks=marks;
         this.name=name;
     }
     void studentDetails(){
         System.out.println("Name: "+this.name);
         System.out.println("Name: "+this.USN);
         System.out.println("Name: "+this.marks);
         System.out.println("Name: "+ college);


     }
    void evaluateMarks(){
        if(marks>=40){
            System.out.println(name + " has passed");
        }
        else{
            System.out.println(name + "has failed");
        }
    }
    public static void main(String[] args){
         S1 s1=new S1(101,"Arun",55);
         s1.evaluateMarks();
         s1.studentDetails();
    }
}
