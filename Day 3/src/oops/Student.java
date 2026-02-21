package oops;
public class Student {
    int USN;
    String name;
    int marks;
    void evaluateMarks(){
        if(marks>=40){
            System.out.println(name + "has passed");
        }
        else{
            System.out.println(name + "has failed");
        }
    }

    public static void main(String[] args){
          Student s1=new Student();
          s1.name="arun";
          s1.marks=55;
          s1.USN=101;
          s1.evaluateMarks();
      }
}
