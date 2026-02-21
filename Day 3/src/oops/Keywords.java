package oops;

/*public class Keywords {
    int i;//instance variable =>to remove ambiguity(confusion)

    void change(int i){
        i=i;
    }
    void display(){
        System.out.println(i);
    }
    public static void main(String[] args){
        Keywords k=new Keywords();
        k.change(10);
        k.display();

    }

}
*/
//it will write a default value as 0 or null ,when it is confused to write which i ,so this keyword is used
public class Keywords {
    int i;//instance variable =>to remove ambiguity(confusion)

    void change(int i){
        this.i=i;
    }
    void display(){
        System.out.println(i);
    }
    public static void main(String[] args){
        Keywords k=new Keywords();
        k.change(10);
        k.display();

    }

}
