package FileReaders.FileWriters;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by kedar on 3/15/2021.
 */
public class FileWriters {
    public void getWriters() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\kedar\\Desktop\\JavaClass\\src\\FileReaders\\FileWriters\\Output");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hello From Java Class");
            bw.newLine();
            bw.write("Hi there");

            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException ex) {
            System.out.println("Input Output Exception");
        }
    }
}
