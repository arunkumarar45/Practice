package Session2;

import java.util.*;

public class Pangram {
    public static void main(String[] args){
        String str="Pack my box with five dozen of liquer jugs ";
        Set<Character> s=new HashSet<>();
        for(char c:str.toLowerCase().toCharArray()){
            if (c >= 'a' && c <= 'z') {
                s.add(c);
            }
        }
        if(s.size()==26){
            System.out.println("Pangram");
        }
        else{System.out.println("NOT");}



    }
}
