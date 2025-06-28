import java.io.File;
import java.io.IOException;

public class MembuatFile {
    public static void main(String[] args) {
        try {
            File fileBaru = new File("contoh.txt");
            if (fileBaru.createNewFile()) {
                System.out.println("File berhasil dibuat: " + fileBaru.getName());
            } else {
                System.out.println("File sudah ada.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi error.");
            e.printStackTrace();
        }
    }
}
