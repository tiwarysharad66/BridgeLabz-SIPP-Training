package ArrayPractice;

import java.util.Scanner;

public class BMI2Darray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Take input for number of persons
        int Persons = s.nextInt();

        // 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[Persons][3];

        // Array to store weight status (Underweight, Normal, etc.)
        String[] WeightStatus = new String[Persons];

        // Input data for each person
        for (int i = 0; i < personData.length; i++) {
            double weight;

            // Input weight and validate it
            weight = s.nextDouble();
            while (weight <= 0) {
                System.out.println("Enter Positive Weight");
                weight = s.nextDouble();
            }
            personData[i][0] = weight; // Store weight

            double height;

            // Input height and validate it
            height = s.nextDouble();
            while (height <= 0) {
                System.out.println("Enter Positive Height");
                height = s.nextDouble();
            }
            personData[i][1] = height; // Store height

            // ✅ Correct BMI formula: BMI = weight / (height * height)
            double BMI = weight / (height * height);
            personData[i][2] = BMI; // Store BMI

            // Determine BMI status
            if (BMI <= 18.4) {
                WeightStatus[i] = "UnderWeight";
            } else if (BMI <= 24.9) {
                WeightStatus[i] = "Normal";
            } else if (BMI <= 39.9) {
                WeightStatus[i] = "OverWeight";
            } else {
                WeightStatus[i] = "Obese";
            }
        }

        // Display data for each person
        for (int i = 0; i < personData.length; i++) {
            System.out.println("Weight of The Person is");
            System.out.println(personData[i][0]);

            System.out.println("Height of The Person is");
            System.out.println(personData[i][1]);

            System.out.println("BMI of The Person is");
            System.out.println(personData[i][2]);

            System.out.println("Weight Status of The Person is");
            System.out.println(WeightStatus[i]);
        }

        s.close();
    }
}
