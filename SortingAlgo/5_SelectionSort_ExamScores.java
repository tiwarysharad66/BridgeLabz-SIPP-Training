// Selection Sort - Sort Exam Scores
public class SelectionSort_ExamScores {
    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {78, 55, 89, 62, 70};
        selectionSort(scores);
        System.out.print("Sorted Exam Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
