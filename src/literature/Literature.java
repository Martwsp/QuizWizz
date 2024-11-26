package literature;

import java.util.Objects;
import java.util.Scanner;

public class Literature {
    private final LiteratureQuestions literatureQuestions;
    private final LiteratureOptions literatureOptions;
    private final LiteratureAnswers literatureAnswers;


    public Literature(int i) {
        this.literatureQuestions = new LiteratureQuestions(i);
        this.literatureOptions = new LiteratureOptions(i);
        this.literatureAnswers = new LiteratureAnswers(i);
    }


    public int literature(int i, Literature literature){
        int noPlayerAnswers = 0;
        String[] playerAnswer = new String[3];
        int score = 0;
        Scanner scanner = new Scanner(System.in);


        while (noPlayerAnswers < literature.literatureAnswers.getNoAnswers()) {
            int k;
            String playerAnswerCurrent;

            printLiteratureQuestion(i, noPlayerAnswers, literature, playerAnswer[0], playerAnswer[1]);
            try {
                playerAnswerCurrent = scanner.nextLine();
                k = literature.literatureAnswers.convertAnswer(playerAnswerCurrent);
            } catch (Exception e) {
                k = 6;
                playerAnswerCurrent = "";
            }
            if (k < 5) {
                if (!Objects.equals(playerAnswerCurrent.toUpperCase(), playerAnswer[0])
                        && !Objects.equals(playerAnswerCurrent.toUpperCase(), playerAnswer[1]))
                {
                    score = score + literature.literatureAnswers.checkAnswer(k);
                    playerAnswer[noPlayerAnswers] = playerAnswerCurrent.toUpperCase();
                    noPlayerAnswers++;
                } else {
                    System.out.println("Cannot select the same answer twice");
                }
            } else {
                System.out.println("Input a single character A, B, C, or D");
            }
        }
        return score;
        }

        public void printLiteratureQuestion(int i, int j, Literature literature, String playerAnswer1, String playerAnswer2) {
            System.out.println("Question number " + (i+1) + " ( " + literature.literatureAnswers.getNoAnswers() + " points )");
            System.out.println(literature.literatureQuestions.getQuestion());
            System.out.println("A:" + literature.literatureOptions.getOption(1));
            System.out.println("B:" + literature.literatureOptions.getOption(2));
            System.out.println("C:" + literature.literatureOptions.getOption(3));
            System.out.println("D:" + literature.literatureOptions.getOption(4));

            if (literature.literatureAnswers.getNoAnswers() == 1) {
                System.out.println("One correct answer.");
                System.out.println("Select answer:");
            } else if (literature.literatureAnswers.getNoAnswers() == 2) {
                if (j == 0) {
                    System.out.println("Two correct answers.");
                    System.out.println("Select first answer:");
                } else if (j == 1) {
                    System.out.println("Two correct answers. " + "Selected: " + playerAnswer1);
                    System.out.println("Select second answer:");
                }
            } else {
                if (j == 0) {
                    System.out.println("Three correct answers.");
                    System.out.println("Select first answer:");
                } else if (j == 1) {
                    System.out.println("Three correct answers. "+ "Selected: " + playerAnswer1);
                    System.out.println("Select second answer:");
                } else if (j == 2) {
                    System.out.println("Three correct answers." + "Selected: " + playerAnswer1 + ", " + playerAnswer2);
                    System.out.println("Select third answer:");
                }
            }
        }
    }





