import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        readFile();
        writeFile();
        readFile();

    }

    public static void createFile() {
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            if(file.createNewFile()) {             //create.NewFile = oluşturur. True/false dönüyor.
                System.out.println("Dosya oluşturuldu.");
            } else {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            e.printStackTrace(); //hatayı metin olarak çıktıya yazar.
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\javademos\\files\\students.txt");
        if(file.exists()){ //Böyle bir dosya varsa true yoksa false döner.
            System.out.println("Dosya adı : " + file.getName());
            System.out.println("Dosya Yolu : " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi? : " + file.canWrite());
            System.out.println("Dosya okunabilir mi?  : " + file.canRead());
            System.out.println("Dosya boyutu : " + file.length()); //byte cinsinden.
        }
    }

    public static void readFile(){
            File file = new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){       // yeni bir satır var mı?
                String line  = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
