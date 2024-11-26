package literature;

public class LiteratureAnswers {
    private final int[] answers = new int[3];

    static private final int[][] Literature = {
            {1,0,0},
            {2,0,0},
            {3,0,0},
            {2,4,0},
            {1,2,0},
            {1,0,0},
            {3,0,0},
            {1,2,4},
            {2,3,4},
            {4,0,0}
    };

    public LiteratureAnswers(int i) {
        this.answers[0] = Literature[i][0];
        this.answers[1] = Literature[i][1];
        this.answers[2] = Literature[i][2];
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
