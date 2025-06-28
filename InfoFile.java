import java.io.File;

public class InfoFile {
    public static void main(String[] args) {
        File file = new File("contoh.txt");
        if (file.exists()) {
            System.out.println("Nama File: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Ukuran (byte): " + file.length());
        } else {
            System.out.println("File tidak ditemukan.");
        }
    }
}
