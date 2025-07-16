import java.io.*;

public class FileReadComparison {
    public static void main(String[] args) throws Exception {
        String fileName = "largefile.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 5_000_000; i++) writer.write("This is line " + i + "\n");
        }

        long start = System.nanoTime();
        try (FileReader fr = new FileReader(fileName)) {
            while (fr.read() != -1);
        }
        long end = System.nanoTime();
        System.out.println("FileReader Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName))) {
            while (isr.read() != -1);
        }
        end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end - start) / 1e6 + " ms");
    }
}