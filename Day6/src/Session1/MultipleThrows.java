package Session1;

public class MultipleThrows {
    static void checkvalues(int num,String text)throws ArithmeticException,NullPointerException{
        if(num<0){
            throw new ArithmeticException("Negative is not Allowed");
        }
        if(text==null){
            throw new NullPointerException("Enter some text");
        }
        System.out.println(num+" "+text);
    }
    public static void main(String args[]){
        try{
            checkvalues(-1,null);
        } catch (NullPointerException e) {
            System.out.println("Message: "+e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Message: "+e.getMessage());
        }
        finally {
            System.out.println("this will execute");

        }
    }
}
