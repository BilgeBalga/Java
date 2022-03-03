import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
           reader  = new  BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.txt"));
           String line = null;
           while((line = reader.readLine())!= null){ //readLine = 1 satır oku.
               total += Integer.valueOf(line);
           }
           System.out.println("total = " + total);
        } catch (FileNotFoundException e) {                      //Dosya bulunamayabilir.
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {                                            //Reader'i kapatmamız gerekiyor.
            try {
                reader.close();                              //reader olmayabilir. Kapatılacak bir dosya olmayabilir. ->IOException.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
