package PersonalPractice;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {

        String[] questions = {
                "what is bio-chemistry?",
                "how old is Nigeria?",
                "who is the present president of Nigeria?"
        };
        String[] answers = { "bla bla", "63", "80"};
        boolean[] results = new boolean[questions.length];

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i< questions.length; i++){

            System.out.println(questions[i]);
            String userResponse  = scanner.nextLine();
            if(userResponse.equals(answers[i]) ){
                results[i] = true;

            }
        }
        scanner.close();

        System.out.println("Results: ");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + (results[i] ? "correct" : "in-correct") );

        }
    }





}


