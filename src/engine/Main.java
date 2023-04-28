package engine;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //NOW IT'S TIME TO USE BUFFERED WRITER AND FILEWRITER USING STRING TO INITIALIZE

        String[] lines = new String[] {"Screw You", "Anything","Just horsin around"};

        String path = "c:\\temp2\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){

            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }

        }
        catch(IOException e){
            e.printStackTrace();

        }
    }
}