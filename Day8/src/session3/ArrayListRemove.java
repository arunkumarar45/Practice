package session3;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<=10;i++){
            list.add(i);

        }
        for (int i=0;i<=list.size();i++){
            if(list.get(i)>7){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
