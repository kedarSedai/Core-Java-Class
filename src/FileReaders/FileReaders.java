package FileReaders;

import java.io.*;

/**
 * Created by kedar on 3/15/2021.
 */
public class FileReaders {
    public void readFile() {

        //creating refrence
        String line = null;

        try {
            //Read the file from the FilePath
            FileReader fr = new FileReader("C:\\Users\\kedar\\Desktop\\JavaClass\\src\\FileReaders\\input");
            //Read the character line by line
            BufferedReader br = new BufferedReader(fr);

            //readLine() method read the text line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            //need to close the file always
            br.close();

            //Possible Exceptions
        } catch (FileNotFoundException e) {
            System.out.println("File Not found");
        } catch (IOException ex) {
            System.out.println("Input Output Exception");
        }

    }
}
