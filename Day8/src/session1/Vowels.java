package session1;

public class Vowels {
    public static void main(String[] args){
        String s="ABCDE";
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.toLowerCase().charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
