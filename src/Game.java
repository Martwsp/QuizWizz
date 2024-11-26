import literature.Literature;
import maths.Maths;

import java.util.Objects;
import java.util.Scanner;

public class Game {

    public void game() {
        int numberOfPlayers = numberOfPlayers();
        if (numberOfPlayers == 1) {
            int score = 0;
            rules(1);
            String subject = selectSubject();
            int noQuestions = selectLength();
            if (Objects.equals(subject, "Literature")) {
                for (int i = 0; i < noQuestions; i++) {
                    Literature literature = new Literature(i);
                    score = score + literature.literature(i, literature);
                }
                System.out.println("Final score: " + score);
            } else if (Objects.equals(subject, "Maths")){
                for (int i = 0; i < noQuestions; i++) {
                    Maths maths  = new Maths(i);
                    score = score + maths.maths(i, maths);
                }
                System.out.println("Final score: " + score);
            } else {
                throw new RuntimeException();
            }
        } else if (numberOfPlayers == 2) {
            rules(2);
            String subject = selectSubject();
            int player1Score = 0;
            int player2Score = 0;
            int player1Index = 0;
            int player2Index = 1;
            if (Objects.equals(subject, "Literature")) {
                for (int i = 0; i < 5; i++) {
                    Literature literature = new Literature(player1Index);
                    System.out.println("Player 1's turn:");
                    player1Score = player1Score + literature.literature(player1Index, literature);
                    player1Index = player1Index + 2;
                    Literature literature1 = new Literature(player2Index);
                    System.out.println("Player 2's turn:");
                    player2Score = player2Score + literature1.literature(player2Index, literature1);
                    player2Index = player2Index + 2;
                }
                System.out.println("Player 1 score: " + player1Score);
                System.out.println("Player 2 score: " + player2Score);
        } else if (Objects.equals(subject, "Maths")) {
            for (int i = 0; i < 5; i++) {
                Maths maths = new Maths(player1Index);
                System.out.println("Player 1's turn:");
                player1Score = player1Score + maths.maths(player1Index, maths);
                player1Index = player1Index + 2;
                Maths maths1 = new Maths(player2Index);
                System.out.println("Player 2's turn:");
                player2Score = player2Score + maths.maths(player2Index, maths1);
                player2Index = player2Index + 2;
            }
            System.out.println("Player 1 score: " + player1Score);
            System.out.println("Player 2 score: " + player2Score);
        } else {
            throw new RuntimeException();
        }
        }
    }

    public int numberOfPlayers() {
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers;
        System.out.println("Select number of players 1-2");
        while (true) {
            try {
                numberOfPlayers = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Type 1 or 2");
            }
        }
        return numberOfPlayers;
    }

    public void rules(int i) {
            System.out.println("You'll be presented by a number of questions. For each question " +
                    "you'll be presented with four options for an answer. Some questions have multiple " +
                    "correct answer, you'll be told how many. Each correct answer is worth one point. " +
                    "Incorrect answers do not deduct points. Answer by typing a, b, c, or d and hitting " +
                    "enter, for questions with multiple correct answers input your first choice and you'll " +
                    "be prompted to input your other choice after.");
        if (i == 2)  {
            System.out.println("In multiplayer, two players take turns in answering different questions. " +
                    "Make sure that you've inputted all options for a multiple option question as " +
                    "the same players has to input all their choices before it's the other player's turn.");
        }
    }

    public String selectSubject() {
        Scanner scanner = new Scanner(System.in);
        String subject;
        System.out.println("Select the subject of questions:");
        System.out.println("A: Literature");
        System.out.println("B: Maths");
        while (true) {
            try {
                subject = scanner.nextLine();
                if (subject.equalsIgnoreCase("A")) {
                    subject = "Literature";
                    break;
                } else if (subject.equalsIgnoreCase("B")) {
                    subject = "Maths";
                    break;
                } else {
                    System.out.println("Must input single character, either A or B");
                }
            } catch (Exception e) {
                System.out.println("Must input single character, either A or B");
            }
        }
        return subject;
    }

    public int selectLength() {
        Scanner scanner = new Scanner(System.in);
        int length;
        int MAX_QUESTION = 10;
        System.out.println("Select number of questions 5-" + MAX_QUESTION);
        while (true) {
            try {
                length = Integer.parseInt(scanner.nextLine());
                if (length < 5 && length > 0) {
                    length = 5;
                    System.out.println("Minimum length is 5");
                    break;
                } else if (length >= 5 && length <= MAX_QUESTION) {
                    System.out.println("Number of questions: " + length);
                    break;
                } else {
                    System.out.println("Must be a number from 5 to" + MAX_QUESTION);
                }
            } catch (Exception e) {
                System.out.println("Must be a number from 5 to " + MAX_QUESTION);
            }
        }
        return length;
    }

    public String tryAgain() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        while (true) {
            try {
                answer = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Type Y to play again, or N to exit");
            }
        }
        return answer;
    }
}
