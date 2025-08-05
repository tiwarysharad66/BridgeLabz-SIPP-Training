import java.io.*;
import java.util.Arrays;

public class ImageByteArray {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("image.jpg");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            byte[] imageBytes = baos.toByteArray();
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream("copy_image.jpg");
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            fis.close();
            baos.close();
            bais.close();
            fos.close();
            System.out.println("Image copied successfully using byte arrays.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}