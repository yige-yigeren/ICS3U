package Exam;

import java.util.Scanner;

public class codeBreaker {
    // Name: Mr. Lei
    // Course Code: ICS3U
    // Date: 2023-05-08
    // For Student Labs and Project

    // print method
    static void print (String[] a, int[] b, int[] c) {
        // print until null
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                break;
            } else {
                System.out.print(a[i] + " " + b[i] + " " + c[i]);
            }
            System.out.println();
        }
    }

    // random method
    static String random () {
        // set color array
        String[] a = {"R", "G", "B", "Y", "W", "P"};
        int[] b = {0,0,0,0};
        // generate random number(chosen color)
        for (int i = 0; i < 4; i++) {
            b[i] = (int) (Math.random() * 6);
        }
        // return random code
        return a[b[0]] + a[b[1]] + a[b[2]] + a[b[3]];
    }

    // correct position method
    static int correctPosition (String a, String b) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (a.charAt(i) == (b.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // incorrect position method
    static int incorrectPosition (String a, String b) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // break if same position
                if (a.charAt(i) == b.charAt(i)) {
                    continue;
                } else if (a.charAt(i) == b.charAt(j) && a.charAt(j) != b.charAt(j)) {
                    // count if same letter but different position
                    // reduce string b to avoid double counting
                    b = b.substring(0, j) + " " + b.substring(j + 1);
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    // check input method
    static Boolean checkInput (String a) {
        // check length
        if (a.length() != 4) {
            System.out.print("\033[H\033[2J"); // clear screen
            System.out.println("ERROR: Input not accepted");
            System.out.println("Please enter 4 letters.");
            return false;
        }
        // check letters "R", "G", "B", "Y", "W", "P"
        for (int i = 0; i < 4; i++) {
            if (a.charAt(i) != 'R' && a.charAt(i) != 'G' && a.charAt(i) != 'B' && a.charAt(i) != 'Y' && a.charAt(i) != 'W' && a.charAt(i) != 'P') {
                System.out.print("\033[H\033[2J"); // clear screen
                System.out.println("ERROR: Input not accepted");
                System.out.println("Please enter letters from R, G, B, Y, W, P.");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); // clear screen
        Scanner sc = new Scanner(System.in); // open scanner
        System.out.println("Welcome to Code Breaker!");
        // ask for instructions
        while (true) {
            System.out.println("You need instructions ? [Yes/No]");
            String inst = sc.nextLine();
            if (inst.equals("Yes")) {
                // print instructions
                System.out.println("The computer will generate a random 4 letter code.");
                System.out.println("You will have 10 tries to guess the code.");
                System.out.println("After each guess, the computer will tell you how many letters are correct. ");
                System.out.println("The computer will also tell you how many letters are correct but in the wrong position.");
                System.out.println("The letters will be R, G, B, Y, W, P.");
                break;
            } else if (inst.equals("No")) {
                break;
            } else {
                System.out.print("\033[H\033[2J"); // clear screen
                System.out.println("ERROR: Input not accepted");
                System.out.println("Please enter Yes or No.");
            }
        }

        // ask start game
        while (true) {
            while (true) {
                System.out.println("Ready to start? [Yes/No]");
                String again = sc.nextLine();
                if (again.equals("Yes")) {
                    break;
                } else if (again.equals("No")){
                    // exit program
                    System.out.println("Goodbye! Have a good day!");
                    sc.close();
                    System.exit(0);
                } else {
                    System.out.println("ERROR: Input not accepted");
                    System.out.println("Please enter Yes or No.");
                }
            }
            System.out.print("\033[H\033[2J"); // clear screen
            // generate random code
            String code = random();
            // code = "GGYW"; // Example code
            // System.out.println("Debug :" + code); // Debug show code
            // Initialize variables
            int count = 0;
            String[] codes = new String[10];
            int[] correct = new int[10];
            int[] incorrect = new int[10];
            // start guessing
            while (true) {
                System.out.println("Please enter your code:");
                String input = sc.nextLine();
                // check input
                if (checkInput(input) == false) {
                    continue;
                } else {
                    // check if win
                    if (input.equals(code)) {
                        System.out.println("Congratulations! You win!");
                        break;
                    } else {
                        // set arrays
                        codes[count] = input;
                        correct[count] = correctPosition(input, code);
                        incorrect[count] = incorrectPosition(input, code);
                        count++;
                        System.out.print("\033[H\033[2J"); // clear screen
                        System.out.println("Guess :" + count);
                        // print arrays
                        print(codes, correct, incorrect);
                        // check if lose
                        if (count == 10) {
                            System.out.println("You lose! The code was " + code);
                            break;
                        }
                    }
                }
            }
        }
    }
}
