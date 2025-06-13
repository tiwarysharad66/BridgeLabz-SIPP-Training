package Day2;

public class EarthVolume {
        public static void main(String[] args) {
            double radiusKm = 6378;
            double pi = Math.PI;
            double volumeKm = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
            double volumeMi = volumeKm / Math.pow(1.609, 3); // convert km³ to mi³

            System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMi);
        }
    }

