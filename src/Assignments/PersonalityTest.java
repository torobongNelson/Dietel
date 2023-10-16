package Assignments;

import java.util.Scanner;

public class PersonalityTest {


    public static String[] QUESTIONS = {

            "how would youdescribe yourself? Do you prefer to be around people or do you need time alone to recharge?",
            "How do you approach life? Do you take things at face value or do you look for deeper meaning?",
            "How do you make decisions? Do you rely on logic and reason or do you consider your emotions and the needs of others?",
            "How do you like to live your life? Do you prefer to have a plan or do you go with the flow?",
            "How do you interact with others? Do you like to be the center of attention or are you more comfortable in the background?",
            "How do you view the world? Are you more interested in the concrete or the abstract?",
            "How do you communicate with others? Do you prefer to be direct or do you tuck in words?",
            "How do you approach your work and personal life? Do you like to have everything mapped out or do you prefer to go with the flow?",
            "What kind of activities do you enjoy doing? Do you prefer to be active and social or do you prefer to spend time alone in your own thoughts?",
            "How do you describe yourself? Are you more comfortable with the traditional or do you prefer to stand out from the crowd?",
            "How do you interact with others? Are you more critical or supportive?",
            "How do you like to live your life? Do you prefer to be organized and structured or do you prefer to take things as they come?",
            "How do you process your thoughts and emotions? Do you prefer to talk things out or do you keep them to yourself?",
            "How do you view the world? Are you more focused on the present or the future?",
            "Are you more interested in justice or mercy?",
            "How do you approach your work and personal life? Do you like to have everything planned out or do you prefer to be flexible?",
            "How do you interact with the world? Do you prefer to take action or do you prefer to think things through carefully?",
            "What are you interested in? Are you more interested in the concrete or the abstract?",
            "How do you interact with others? Are you more focused on tasks or people?",
            "What is important to you in life? Do you value control or freedom?"
    };


    public static String[][] ANSWERS = {

            {"Expend energy, enjoy groups", "Conserve energy, enjoy one-on-one"},
            {"Interpret literally","Look for meaning and possibilities"},
            {"Logical, thinking, questioning", "Empathetic, feeling, accommodating"},
            {"Organized, orderly", "Flexible, adaptable"},
            {"More outgoing, think out loud", "More reserved, think to yourself"},
            {"Practical, realistic, experiential","Imaginative, innovative, theoretical "},
            {"Candid, straight forward, frank", "Tactful, kind, encouraging  "},
            {"Plan, schedule", "Unplanned, spontaneous"},
            {"Seek many tasks," ," public activities, "},
            {"Standard, usual, conventional ", " Different, novel, unique "},
            {"Firm, tend to criticize, hold the line " , "Gentle, tend to appreciate, conciliate "},
            {"Regulated, structured ", " Easy-going, live and let live "},
            {"External, communicative, express yourself", "Internal, reticent, keep to yourself"},
            {"Focus on here-and-now", "Look to the future, global perspective, big picture "},
            {"Tough-minded, just ", " Tender-hearted, merciful  "},
            {"Active, initiate ",  "Reflective, deliberate"},
            {"Facts, things, what is", "Ideas, dreams, what could be, philosophical"},
            {"Matter of fact, issue-oriented", "Sensitive, people-oriented, compassionate  "},
            {"Control, govern "," Latitude, freedom"},
    };

    public static String[] PERSONALITY_TRAITS = {
            "Extrovert",
            "Introvert",
            "Sensitive",
            "Intuitive",
            "Thoughtful",
            "Percieving",
            "Judging",
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] responses =  new String[QUESTIONS.length];


        for(int i = 0; i < QUESTIONS.length; i++){

            System.out.println(QUESTIONS[i]);

            System.out.println("A. " + ANSWERS[i][0]);
            System.out.println("B. " + ANSWERS[i][1]);
            System.out.print("Make a choice: ");

            String response = scanner.nextLine();
            while(!response.equals("A") && !response.equals("B")){
                System.out.println("Invalid input. Please enter A or B");
                System.out.print("Make a choice: ");
                response = scanner.nextLine();
            }

            responses[i] = response;
        }

        String personalityTrait = "";

        for (int i = 0; i < QUESTIONS.length; i++) {
            personalityTrait += responses[i];
        }

        System.out.println("Your Responses:");
        for (int i = 0; i < QUESTIONS.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + QUESTIONS[i] + " - Answer: " + ANSWERS[i][responses[i].charAt(0) - 'A']);
        }

        System.out.println("Your personlaity trait: " + PERSONALITY_TRAITS[personalityTrait.charAt(0) - 'A']);
    }

}


}
