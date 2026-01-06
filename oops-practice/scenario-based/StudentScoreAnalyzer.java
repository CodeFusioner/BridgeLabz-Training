class InvalidScoreException extends Exception {
    InvalidScoreException(String message) {
        super(message);
    }
}
public class StudentScoreAnalyzer {
    public static double calculateAverage(int[] scores) throws InvalidScoreException {
        int sum = 0;
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new InvalidScoreException("Score out of range: " + score);
            }
            sum += score;
        }
        return (double) sum / scores.length;
    }
    public static int findMax(int[] scores) throws InvalidScoreException {
        int max = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new InvalidScoreException("Score out of range: " + score);
            }
            if (score > max) max = score;
        }
        return max;
    }
    public static int findMin(int[] scores) throws InvalidScoreException {
        int min = Integer.MAX_VALUE;
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new InvalidScoreException("Score out of range: " + score);
            }
            if (score < min) min = score;
        }
        return min;
    }
    public static void main(String[] args) {
        int[] scores = {85, 92, 76, 88, 95};
        try {
            System.out.println("Average: " + calculateAverage(scores));
            System.out.println("Highest: " + findMax(scores));
            System.out.println("Lowest: " + findMin(scores));
        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
