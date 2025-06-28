import java.io.FileWriter;
import java.io.IOException;

public class MenulisFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("contoh.txt");
            writer.write("Ini adalah teks yang ditulis ke dalam file.");
            writer.close();
            System.out.println("Berhasil menulis ke file.");
        } catch (IOException e) {
            System.out.println("Terjadi error saat menulis file.");
            e.printStackTrace();
        }
    }
}
