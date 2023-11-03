/**
 * MultipleChoiceQuestion class takes the parameters of a question, and presents it to the user for response in the format selected by the method used. 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MultipleChoiceQuestion {
/**
 * terminalQuestion method takes the parameters of a question, and presents it to the user for response in the format selected by the method used.
 * @param question a string containing the question to be asked
 * @param choices an ArrayList of strings containing the possible answers to the question
 * @param answer a string containing the correct answer to the question
 * @param randomizeAnswerOrder a boolean value that determines whether the order of the answers is randomized
 * @return a boolean value that is true if the user's answer is correct, and false if it is incorrect
 */
    public boolean terminalQuestion(String question, ArrayList<String> choices, String answer,
            boolean randomizeAnswerOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        System.out.println("Enter the number of your answer choice: ");
        if (randomizeAnswerOrder) {
            Collections.shuffle(choices);
        }
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i));
        }
        boolean isCorrect = false;
        for (int i = 4; i > 0; i--) {
            try {
                isCorrect = answer.equalsIgnoreCase(choices.get(Integer.parseInt(scanner.nextLine()) - 1));
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid number. remaining attempts: " + (i - 1));
            }
        }
        scanner.close();
        return isCorrect;
    }
}
