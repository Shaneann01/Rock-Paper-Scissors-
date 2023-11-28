import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rock, Paper, Scissors game!\n");
        String rules;
        rules = "Rules:\n1) Try and beat the computer!\n2) 1 = Rock, 2 = Scissors, 3 = Paper\nRock beats Scissors but loses to Paper.\nScissors beats Paper but loses to Rock.\nPaper loses to Scissors but beats Rock.";
        System.out.println(rules);
        System.out.println("\nGOOD LUCK AND HAVE FUN ^-^");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 1 for Rock, 2 for Scissors and 3 for Paper:");
        String stringOutput = userInput.nextLine();

        int input;
        input = Integer.parseInt(stringOutput);

        int max = 4;
        int min = 1;
        int randomNum = (int) (Math.floor(Math.random() * (max - min) + min));

        System.out.println(randomNum);
        String computer;
        String results;
        String user;
        switch (input) {
            case 1:
                user = "Rock";
                if(randomNum == input){
                    computer = "Rock";
                    results = "Draw";
                } else if (randomNum == 2) {
                    computer = "Scissors";
                    results = "You Win!";
                }else{
                    computer = "Paper";
                    results = "Computer Wins!";
                }
                System.out.println("Computer: " + computer);
                System.out.println("You: " + user);
                System.out.println("Results: " + results);
                break;
            case 2:
                user = "Scissors";
                if(randomNum == input){
                    computer = "Scissors";
                    results = "Draw";
                } else if (randomNum == 3) {
                    computer = "Paper";
                    results = "You Win!";
                }else{
                    computer = "Rock";
                    results = "Computer Wins!";
                }
                System.out.println("Computer: " + computer);
                System.out.println("You: " + user);
                System.out.println("Results: " + results);
                break;
            case 3:
                user = "Paper";
                if(randomNum == input){
                    computer = "Paper";
                    results = "Draw";
                } else if (randomNum == 2) {
                    computer = "Rock";
                    results = "You Win!";
                }else{
                    computer = "Scissors";
                    results = "Computer Wins!";
                }
                System.out.println("Computer: " + computer);
                System.out.println("You: " + user);
                System.out.println("Results: " + results);
                break;
            default: System.out.println("Invalid input, please enter number 1 - 3");
            break;
        }

    }
}
