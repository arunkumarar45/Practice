package oops;
class RBI{
    double rateOfInterest(){
        return 6.5;
    }
}
class Icici extends RBI{
    @Override
    double rateOfInterest(){
        return 7.5;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfInterest(){
        return 8.5;
    }
}
public class OverridingPoly {
    public static void main(String[] args){
        //the reference doesn't matter,the object type matter i.e RBI a2=new Icici();
        RBI a1=new RBI();
        Icici a2=new Icici();
        HDFC a3=new HDFC();
        System.out.println(a1.rateOfInterest());
        System.out.println(a2.rateOfInterest());
        System.out.println(a3.rateOfInterest());
    }
}
