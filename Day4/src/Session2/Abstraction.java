package Session2;
abstract class Hero{
    private String name;
    public Hero(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    abstract void power();
    static void information(){
        System.out.println("DC superheros");
    }

}
class WonderWomen extends Hero{
    public WonderWomen(String name){
        super(name);
    }
    @Override
    void power(){
       System.out.println(getName());
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Hero.information();
        Hero hero=new WonderWomen("Spider woman");
        hero.power();
    }
}
