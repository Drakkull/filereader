package engine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "c:\\temp2\\git.txt";

        FileReader fr= null;
        BufferedReader br= null;

        System.out.println("----------------------------------");
        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while ( line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error:  " +e.getMessage());
        }

        System.out.println("-----------TERMINOU---------------");
    }
}
