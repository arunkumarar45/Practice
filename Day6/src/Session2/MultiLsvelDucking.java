package Session2;

import java.io.FileReader;
import java.io.IOException;

public class MultiLsvelDucking
{
    static void readFile()throws IOException{
        FileReader fr=new FileReader("file.txt");
        System.out.println("File opend successfully");
    }
    static void processFile()throws IOException{
        readFile();

    }
    static void handleFile()throws IOException{

       processFile();
    }
    public static void main(String[] args){
        try{
            handleFile();
        } catch (IOException e) {
            System.out.println("Caught exception in main: "+e.getMessage());
        }
    }
}
