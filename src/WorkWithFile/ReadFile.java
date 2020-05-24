package WorkWithFile;

import java.io.*;

public class ReadFile {

   public void readFile() throws IOException {
       File file = new File("file.txt");
       FileReader fileReader = new FileReader(file); // поток который подключается к текстовому файлу
       BufferedReader bufferedReader = new BufferedReader(fileReader);

   }
}
