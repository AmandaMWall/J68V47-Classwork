public class ExamScores {
    public static void main(String[] args) {
        int[] scores = {10, 89, 27, 19, 0, 12, 56, 99, 88, 10};
        int sum = 0;

        for (int score : scores) {
            System.out.println(score);
            sum += score;
        }

        System.out.format("The average score is: %d", sum / scores.length);
    }
}
