package Day2;

public class AveragePercentagePCM {
    public static void main(String[] args) {
        int MathsSamMarks = 94;
        int PhysicsSamMarks = 95;
        int ChemistrySamMarks = 96;
        int totalSubjects = 3;
        int sumtotal =MathsSamMarks+PhysicsSamMarks+ChemistrySamMarks;
        System.out.println(sumtotal);
        int average = (sumtotal)/(totalSubjects);
        System.out.println("Sam's average marks in pcm is "+ average);
    }
}
