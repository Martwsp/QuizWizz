package maths;

public class MathsAnswers {
    private final int[] answers = new int[3];

    static private final int[][] Maths = {
            {3,0,0},
            {2,0,0},
            {1,3,0},
            {4,0,0},
            {1,0,0},
            {1,2,0},
            {2,0,0},
            {3,0,0},
            {3,0,0},
            {2,0,0}
    };

    public MathsAnswers(int i) {
        this.answers[0] = Maths[i][0];
        this.answers[1] = Maths[i][1];
        this.answers[2] = Maths[i][2];
    }

    public int getNoAnswers(){
        if (answers[2] > 0) {
            return 3;
        } else if (answers[1] > 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public int convertAnswer(String string) {
        try {
            return switch (string.toUpperCase()) {
                case "A" -> 1;
                case "B" -> 2;
                case "C" -> 3;
                case "D" -> 4;
                default -> 5;
            };
        } catch (Exception e) {
            return 6;
        }
    }

    public int checkAnswer(int i) {
        int score = 0;
        for (int j = 0; j < getNoAnswers(); j++) {
            if (i == answers[j]) {
                score++;
            }
        }
        return score;
    }

}
