import java.util.Scanner;
import java.util.Random;

public class SimonSays {
    public static void main(String[] args) throws Exception {
        Scanner fetch = new Scanner (System.in);
        String playAgain;
        //initializing a variable to break out of do-while loop
        int breakOut = 0;
        //initializing lists for the separate levels to add the random sequences to
        String colorList = "";
        String numberList = "";
        String letterList = "";

        //do while loop so you are able to replay if you choose to
        do {
            System.out.println("Which difficulty level do you want: easy, medium, or hard?");
            String level = fetch.nextLine();
            int score = 0;
            //allowing user to choose difficulty level with conditionals
            if (level.equalsIgnoreCase("easy")) {
                String colors[] = {"Red", "Green", "Yellow", "Blue"};
                //for loop to add additional random values to sequence if answer is correct
                for (int j = 0; score == j; j++) {
                        Random random = new Random();
                        int randomColor = random.nextInt(colors.length);
                        //adding the colors to the color list string
                        colorList += colors[randomColor] + " ";
                        System.out.println("Simon says: " + colorList);
                    //2 second pause and then clears the terminal for 200 spaces
                    Thread.sleep(2000);
                    for (int k = 0; k <= 200; k++ ) {
                        System.out.println(" ");
                    }
                    String easyAnswer = fetch.nextLine();
                    //ignoring casing and spaces
                    if (easyAnswer.replace(" ", "").equalsIgnoreCase(colorList.replace(" ", ""))) {
                        score +=1;
                        System.out.println("Right! Your score is " +score+ ".");
                    }

                    else {
                        System.out.println("Incorrect! Your score for this round was " +score+ ".");
                        //loop that repeats if the user types in an invalid answer, set to 100 just as an arbitrary number
                        for (int l = 0; l <= 100; l++) {
                            System.out.println("Do you want to play again (yes or no)?");
                            playAgain = fetch.nextLine();
                            if (playAgain.equalsIgnoreCase("yes")) {
                                System.out.println("Good choice!");
                                break;
                            }
                            else if (playAgain.equalsIgnoreCase("no")) {
                                System.out.print("Ok, goodbye!");
                                //exit out of do while loop
                                breakOut = 1;
                                break;
                            }
                            else {
                                System.out.println("That is not a valid answer!");
                            }
                        }
                    }
                }
            }
            //medium mode is formatted similarly to easy
            else if (level.equalsIgnoreCase("medium")) {
                //array of numbers 1-9
                String numbers[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
                Random random2 = new Random();
                for (int m = 0; score == m; m++) {
                    int randomNumber = random2.nextInt(numbers.length);
                    numberList += numbers[randomNumber] + " ";
                    System.out.println("Simon says: " + numberList);

                    Thread.sleep(2000);
                    for (int l = 0; l <= 200; l++) {
                        System.out.println(" ");
                    }
                    String mediumAnswer = fetch.nextLine();
                    if (mediumAnswer.replace(" ", "").equalsIgnoreCase(numberList.replace(" ", ""))) {
                        score += 1;
                        System.out.println("Right! Your score is " +score+ ".");
                    }
                    else {
                        System.out.println("Incorrect! Your score for this round was " +score+ ".");
                        for (int n = 0; n <= 100; n++) {
                            System.out.println("Do you want to play again (yes or no)?");
                            playAgain = fetch.nextLine();
                            if (playAgain.equalsIgnoreCase("yes")) {
                                System.out.println("Good choice!");
                                break;
                            }
                            else if (playAgain.equalsIgnoreCase("no")) {
                                System.out.print("Ok, goodbye!");
                                breakOut = 1;
                                break;
                            }
                            else {
                                System.out.println("That is not a valid answer!");
                            }
                        }
                    }
                }
            }
            //hard mode is formatted similarly to easy and medium
            else if (level.equalsIgnoreCase("hard")) {
                //array of all possible letters
                String letters[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                        "n","o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                Random random3 = new Random();
                for (int o = 0; score == o; o++) {
                    int randomLetter = random3.nextInt(letters.length);
                    letterList += letters[randomLetter] + " ";
                    System.out.println("Simon says: " + letterList);
                    Thread.sleep(2000);
                    for (int n = 0; n <=200; n++) {
                        System.out.println(" ");
                    }
                    String hardAnswer = fetch.nextLine();
                    if (hardAnswer.replace(" ", "").equalsIgnoreCase(letterList.replace(" ", ""))) {
                        score += 1;
                        System.out.println("Right! Your score is " +score+ ".");
                    }
                    else {
                        System.out.println("Incorrect! Your score for this round was " +score+ ".");
                        for (int p = 0; p <= 100; p++) {
                            System.out.println("Do you want to play again (yes or no)?");
                            playAgain = fetch.nextLine();
                            if (playAgain.equalsIgnoreCase("yes")) {
                                System.out.println("Good choice!");
                                break;
                            }
                            else if (playAgain.equalsIgnoreCase("no")) {
                                System.out.print("Ok, goodbye!");
                                breakOut = 1;
                                break;
                            }
                            else {
                                System.out.println("That is not a valid answer!");
                            }
                        }




                    }
                }
            }
            else {
                //invalid difficulty level response if user answer isn't easy, medium or hard
                System.out.println("That is not a valid difficulty level.");
            }
        }
        while (breakOut <= 0);
        fetch.close();
    }
}
