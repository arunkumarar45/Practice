package session1;

import java.util.Scanner;

public class StringBufferDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuffer sb=new StringBuffer(input);
        sb.append("Alien");
        System.out.println(sb);
        //insert()
        sb.insert(0,"hi");
        System.out.println(sb);

        //delete
        sb.delete(0,5);
        System.out.println(sb);
        sb.replace(3,7,"Sapthagiri");
        System.out.println(sb);
        //reverse
        sb.reverse();
        System.out.println(sb);


    }
}


