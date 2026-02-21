import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine();
        String typeOfday=switch(day){
            case "Mon","Tue","wed","thhurs","fri"->"Weekday";
            case "sat","sun"->"weekend";
            default -> {
                if(day.isEmpty()){
                    yield "Sorry! No data";

                }
                else{
                    yield "Invalid Data";
                }
            }

        };
        System.out.println("typeofday: " +typeOfday);
    }
}
