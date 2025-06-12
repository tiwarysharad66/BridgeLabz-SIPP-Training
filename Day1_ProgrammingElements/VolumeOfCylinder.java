package Day1;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int radius = s.nextInt();
        int height= s.nextInt();
        int volume = (int)(Math.PI*(Math.pow(radius,2)*height));
        System.out.println(volume);

    }
}
