/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04_glu_rufinoii;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int roundsToWin = 2;
        int userInput;
        boolean loopIsOn = true;

        while (loopIsOn == true) {
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");

            switch (userInput = sc.nextInt()) {
                case 1:
                    int computerScore = 0;
                    int playerScore = 0;

                    System.out.println("This match will be first to " + roundsToWin + " wins.");
                    while (loopIsOn = true) {
                        if (playerScore == roundsToWin) {
                            System.out.println("Player wins!" + "\n");
                            break;
                        } else if (computerScore == roundsToWin) {
                            System.out.println("Computer wins!" + "\n");
                            break;
                        }

                        int computerMove = (int) Math.floor(Math.random() * 3) + 1;

                        System.out.println("The computer has selected its move. Select your move:");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Scissors");

                        int playerMove = sc.nextInt();
                        if (playerMove < 1 || playerMove > 3) {
                            System.out.println("\n" + "Your input is invalid! Please try again." + "\n");
                            continue;
                        }
                        
                        String result;
                        switch (Move.compareMoves(getMove(playerMove, rock, paper, scissors), getMove(computerMove, rock, paper, scissors))) {
                            case 0:
                                result = "Player wins the round!";
                                playerScore++;
                                break;
                            case 1:
                                result = "Computer wins the round!";
                                computerScore++;
                                break;
                            default:
                                result = "Round is tied!";
                        }

                        System.out.println("Player chose " + getMove(playerMove, rock, paper, scissors).getName() + ". Computer chose " + getMove(computerMove, rock, paper, scissors).getName() + ". " + result);
                        System.out.println("Player: " + playerScore + " - Computer: " + computerScore + "\n");
                    }
                    break;
                case 2:
                    System.out.println("How many wins are needed to win a match?");
                    int newRoundsToWin;
                    newRoundsToWin = sc.nextInt();

                    if (newRoundsToWin < 1) {
                        System.out.println("\n" + "Sorry, the number you entered is too low, please enter an integer number between 1-100" + "\n");
                    } else if (newRoundsToWin > 100) {
                        System.out.println("\n" + "Sorry, the number you entered is too high, please enter an integer number between 1-100" + "\n");
                    } else {
                        System.out.println("\n" + "Ok, the rounds needed to win has been changed to " + newRoundsToWin + ". Thanks!" + "\n");
                        roundsToWin = newRoundsToWin;
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Thank you for playing!");
                    loopIsOn = false;
                    break;
                default:
                    System.out.println("Your input is invalid! Please try again and input a number from 1-3.");

            }
        }

    }

    public static Move getMove(int i, Move m1, Move m2, Move m3) {
        switch (i) {
            case 1:
                return m1;
            case 2:
                return m2;
            default:
                return m3;
        }
    }
}
// 1. create menu
// 2. game:
// random computer move
// player move
// compare
// 3. settings
// 4. exit
/* Notes:

- When comparing strings, use the equals method (e.g. s1.equals(“Start game”); or s1.equalsIgnoreCase("start game"))
- You may or may not add other conditions such as guessing beyond the limit, setting a lower limit above the upper limit, etc.
- To generate a random number from 1 to 3, use the following line: int random = (int) Math.floor(Math.random()*3) + 1;

Sample output:

Welcome to Rock, Paper, Scissors. Please choose an option:
1. Start game
2. Change number of rounds
3. Exit application
> 1

This match will be first to 2 wins.
The computer has selected its move. Select your move:
1. Rock
2. Paper
3. Scissors
> 3

Player chose Scissors. Computer chose Paper. Player wins round!
Player: 1 - Computer: 0

The computer has selected its move. Select your move:
1. Rock
2. Paper
3. Scissors
> 3

Player chose Scissors. Computer chose Rock. Computer wins round!
Player: 1 - Computer: 1

The computer has selected its move. Select your move:
1. Rock
2. Paper
3. Scissors
> 2

Player chose Paper. Computer chose Paper. Round is tied!
Player: 1 - Computer: 1

The computer has selected its move. Select your move:
1. Rock
2. Paper
3. Scissors
> 1

Player chose Rock. Computer chose Scissors. Player wins round!
Player: 2 - Computer: 1

Player wins!

Welcome to Rock, Paper, Scissors. Please choose an option:
1. Start game
2. Change number of rounds
3. Exit application
> 2

How many wins are needed to win a match?
> 5

New setting has been saved!

Welcome to Rock, Paper, Scissors. Please choose an option:
1. Start game
2. Change number of rounds
3. Exit application
> 3

Thank you for playing!
 */
