package Session1;
//
public class Superhero {
    private String name;
    private String power;

    public void setName(String name) {
        this.name = name;
   }
     public void setPower(String power) {
         this.power = power;
     }
    public String getName() {
        return name;
    }
    public String getPower() {
        return power;
    }
    void display() {
        System.out.println("Hero:" + name + ", Power:" + power);
    }

   public static void main(String[] args){
        Superhero sh=new Superhero();
        sh.setName("Superman");
        sh.setPower("heat vision");
        sh.display();
        System.out.println(sh.getName());
        System.out.println(sh.getPower());
   }
}