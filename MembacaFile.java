import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MembacaFile {
    public static void main(String[] args) {
        try {
            File file = new File("contoh.txt");
            Scanner pembaca = new Scanner(file);
            while (pembaca.hasNextLine()) {
                String data = pembaca.nextLine();
                System.out.println("Isi File: " + data);
            }
            pembaca.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan.");
            e.printStackTrace();
        }
    }
}
