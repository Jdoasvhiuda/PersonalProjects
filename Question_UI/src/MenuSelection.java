
/**
 * MenuSelection class takes the parameters of a menu, and presents it to the user for response in the format selected by the method used. 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MenuSelection {
    /**
     * terminalMenu method takes the parameters of a question, and presents it to
     * the user for response in the format selected by the method used.
     * 
     * @param question a string containing the question to be asked
     * @param choices  an ArrayList of strings containing the possible answers to
     *                 the question
     * @return a String of the selection made by the user
     */
    public String terminalMenu(String question, ArrayList<String> choices) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        System.out.println("Enter the number of your answer choice: ");

        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i));
        }
        System.out.println("0. Exit");
        String answer = "";
        for (int i = 4; i > 0; i--) {
            try {
                answer = choices.get(Integer.parseInt(scanner.nextLine()) - 1);
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid number. remaining attempts: " + (i - 1));
            }
        }
        scanner.close();
        return answer;
    }
}
