public class StudentScores {
    public static void main(String[] args) {
                int[] scores = {85, 90, 78, 92, 88, 76, 95, 89};
        
                int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        

        double averageScore = (double) totalScore / scores.length;
        
        
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
    }
}