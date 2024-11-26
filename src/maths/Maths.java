package maths;

import java.util.Objects;
import java.util.Scanner;

public class Maths {
    private final MathsQuestions mathsQuestions;
    private final MathsOptions mathsOptions;
    private final MathsAnswers mathsAnswers;


    public Maths(int i) {
        this.mathsQuestions = new MathsQuestions(i);
        this.mathsOptions = new MathsOptions(i);
        this.mathsAnswers = new MathsAnswers(i);
    }


    public int maths(int i, Maths maths){
        int noPlayerAnswers = 0;
        String[] playerAnswer = new String[3];
        int score = 0;
        Scanner scanner = new Scanner(System.in);


        while (noPlayerAnswers < maths.mathsAnswers.getNoAnswers()) {
            int k;
            String playerAnswerCurrent;

            printMathsQuestion(i, noPlayerAnswers, maths, playerAnswer[0], playerAnswer[1]);
            try {
                playerAnswerCurrent = scanner.nextLine();
                k = maths.mathsAnswers.convertAnswer(playerAnswerCurrent);
            } catch (Exception e) {
                k = 6;
                playerAnswerCurrent = "";
            }
            if (k < 5) {
                if (!Objects.equals(playerAnswerCurrent.toUpperCase(), playerAnswer[0])
                        && !Objects.equals(playerAnswerCurrent.toUpperCase(), playerAnswer[1]))
                {
                    score = score + maths.mathsAnswers.checkAnswer(k);
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

        public void printMathsQuestion(int i, int j, Maths maths, String playerAnswer1, String playerAnswer2) {
            System.out.println("Question number " + (i+1) + " ( " + maths.mathsAnswers.getNoAnswers() + " points )");
            System.out.println(maths.mathsQuestions.getQuestion());
            System.out.println("A:" + maths.mathsOptions.getOption(1));
            System.out.println("B:" + maths.mathsOptions.getOption(2));
            System.out.println("C:" + maths.mathsOptions.getOption(3));
            System.out.println("D:" + maths.mathsOptions.getOption(4));

            if (maths.mathsAnswers.getNoAnswers() == 1) {
                System.out.println("One correct answer.");
                System.out.println("Select answer:");
            } else if (maths.mathsAnswers.getNoAnswers() == 2) {
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





