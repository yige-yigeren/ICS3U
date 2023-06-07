package Exam;

import java.util.Scanner;
import java.util.ArrayList;

public class tictactoe {
    public static void main(String[] args) {
    // Name: Mr. Lei
    // Course Code: ICS3U
    // Date: 2023-05-08
    // For Student Labs and Project
        System.out.print("\033[H\033[2J"); // clear screen
        System.out.flush();
        while (true) {
            int user = 0; // 1 for player 1, 2 for player 2
            int piecec = 1;
            int count = 0; // count for rounds
            int x = 0, y = 0; // coordinate
            char[] piecel = {'-', 'X', 'O'};
            tBoard board = new tBoard();
            Scanner sc = new Scanner(System.in);
            int mode = 0;
            System.out.println("Welcome to Tic Tac Toe!");
            // ask for play or not
            while (true) {
                System.out.println("Do you want to play? [Y/N]");
                String ans = sc.next();
                if (ans.equals("Y") || ans.equals("y")) {
                    break;
                } else if (ans.equals("N") || ans.equals("n")) {
                    System.out.println("Bye!");
                    sc.close();
                    System.exit(0);
                } else {
                    System.out.println("[ERROR] Please enter Y or N.");
                    continue;
                }
            }
            // ask for game mode
            while (true) {
                System.out.println("Please choose a mode: [1]Player vs Player [2]Player vs Computer");
                mode = sc.nextInt();
                if (mode != 1 && mode != 2) {
                    System.out.println("[ERROR] Please enter a number between 1 to 3.");
                } else {
                    break;
                }
            }
            System.out.print("\033[H\033[2J"); // clear screen
            System.out.flush();
            // continue the game
            while (true) {
                // who first
                if (count == 0){
                    while (true) {
                        int bprint = 1;
                        System.out.println("┏━━━━━━━━━━━━━┓");
                        for (int i = 0; i < 3; i++) {
                            System.out.print("┃ ");
                            for (int j = 0; j < 3; j++) {
                                System.out.print("-" + bprint + "- ");
                                bprint++;
                            }
                            System.out.println("┃");
                        }
                        System.out.println("┗━━━━━━━━━━━━━┛");
                        System.out.println("Please guess whether it is 0 or 1");
                        int guess = sc.nextInt();
                        int random = (int) (Math.random() * 2);
                        if (guess == 0 || guess == 1) {
                            if (guess == random) {
                                user = 1;
                                System.out.println("You are right!");
                                System.out.println("[Message] Player 1 first!");
                                break;
                            } else {
                                user = 2;
                                System.out.println("You are wrong!");
                                if (mode == 2) {
                                    System.out.println("[Message] Computer first!");
                                } else {
                                System.out.println("[Message] Player 2 first!");
                                }
                                break;
                            }
                        } else {
                            System.out.println("[ERROR] Please enter 0 or 1.");
                            continue;
                        }
                    }
                // check tie
                } else if (count == 9) {
                    System.out.println("[Message] It's a tie!");
                    board.print();
                    System.out.println("Game over.");
                    break;
                } else {
                    board.print();
                }
                // computer's turn
                if (mode == 2&& user == 2) {
                    /* Easy Ai By Mr. Lei
                     * First calculate whether the next round can win
                     * If not, calculate the threat value of each position
                    */
                    System.out.println("Computer's turn: (Shape: '" + piecel[piecec] + "')");
                    // pieced is status
                    int pieced = 0;
                    // AI step 1
                    // check whether the next round can win
                    for (int i = 0; i < 9; i++) {
                        if (board.getPiece(i+1) == '-') {
                            board.addPiece(piecel[piecec], i+1);
                            if (board.win()) {
                                x = i / 3;
                                y = i % 3;
                                pieced = 1;
                                board.addPiece('-', i+1);
                                break;
                            }
                            board.addPiece('-', i+1);
                        }
                    }
                    // AI step 2-1
                    // check whether the next round will lose
                    if (pieced == 0) {
                        for (int i = 0; i < 9; i++) {
                            if (board.getPiece(i+1) == '-') {
                                board.addPiece(piecel[piecec % 2 + 1], i+1);
                                if (board.win()) {
                                    x = i / 3;
                                    y = i % 3;
                                    pieced = 1;
                                    board.addPiece('-', i+1);
                                    break;
                                }
                                board.addPiece('-', i+1);
                            }
                        }
                    }
                    // AI step 2-2
                    // check whether the next 2 round will lose
                    if (pieced == 0) {
                        for (int i = 0; i < 9; i++) {
                            if (board.getPiece(i+1) == '-') {
                                board.addPiece(piecel[piecec % 2 + 1], i+1);
                                if (board.win()) {
                                    break;
                                } else {
                                    int way = 0;
                                    for (int j = 0; j < 9; j++) {
                                        if (board.getPiece(j+1) == '-') {
                                            board.addPiece(piecel[piecec % 2 + 1], j+1);
                                            if (board.win()) {
                                                board.addPiece(piecel[piecec], j+1);
                                                for (int k = 0; k < 9; k++) {
                                                    if (board.getPiece(k+1) == '-') {
                                                        board.addPiece(piecel[piecec % 2 + 1], k+1);
                                                        if (board.win()) {
                                                            way++;
                                                        }
                                                        board.addPiece('-', k+1);
                                                    }
                                                }
                                            }
                                            board.addPiece('-', j+1);
                                        }
                                    }
                                    if (way>=2) {
                                        x = i / 3;
                                        y = i % 3;
                                        pieced = 1;
                                        board.addPiece('-', i+1);
                                        break;
                                    }
                                }
                                board.addPiece('-', i+1);
                            }
                        }
                    }
                    // AI step 3
                    // piece the best position
                    if (pieced == 0) {
                        int[][] weight = {
                            {4, 2, 4},
                            {2, 9, 2},
                            {4, 2, 4}
                        }; // Store of default weight
                        int[][] boards = {
                            {0, 0, 0},
                            {0, 0, 0},
                            {0, 0, 0}
                        }; // Store of weight of each position
                            // load now board
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    if (board.getPiece(i * 3 + j + 1) == piecel[piecec]) {
                                        boards[i][j] = 1;
                                    } else if (board.getPiece(i * 3 + j + 1) == piecel[piecec % 2 + 1]) {
                                        boards[i][j] = -1;
                                    }
                                }
                            }
                            // calculate the weight of each position
                            int max = 0;
                            int maxnum = 0;
                            ArrayList<Integer> maxstore = new ArrayList<Integer>();
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    if (boards[i][j] == 0) {
                                        weight[i][j] = weight[i][j] + boards[(i+1)%3][j] + boards[(i+2)%3][j] + boards[i][(j+1)%3] + boards[i][(j+2)%3];
                                        if ( i == j ) {
                                            weight[i][j] += boards[(i+1)%3][(j+1)%3] + boards[(i+2)%3][(j+2)%3];
                                        } else if ( i + j == 2 ) {
                                            weight[i][j] += boards[(i+1)%3][(j+2)%3] + boards[(i+2)%3][(j+1)%3];
                                        }
                                        if (weight[i][j] > max) {
                                            max = weight[i][j];
                                        }
                                    } else {
                                        weight[i][j] = -200;
                                    }
                                }
                            }
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    if (weight[i][j] == max) {
                                        maxnum++;
                                        maxstore.add(i * 3 + j + 1);
                                    }
                                }
                            }
                            // random choose one of the best position
                            x = (maxstore.get((int)(Math.random() * maxnum)) - 1) / 3;
                            y = (maxstore.get((int)(Math.random() * maxnum)) - 1) % 3;
                            pieced = 1;
                        }
                    // place the piece
                        int piece = x * 3 + y + 1;
                        board.addPiece(piecel[piecec], piece);
                        System.out.println(piece);
                        System.out.println("[Message] Computer placed a piece at " + (piece) + " [" + (x+1) + "," + (y+1) + "]");
                } else {
                    // player's turn
                    if (user == 1) {
                        System.out.println("Player 1 turn: (Shape: '" + piecel[piecec] + "')");
                    } else {
                        System.out.println("Player 2 turn: (Shape: '" + piecel[piecec] + "')");
                    }
                    while (true) {
                        System.out.println("Please enter a coordinate:");
                        int num = sc.nextInt();
                        if (num < 1 || num > 9) {
                            System.out.println("[ERROR] Please enter a number between 1 to 9.");
                            continue;
                        }
                        x = (num - 1) / 3;
                        y = (num - 1) % 3;
                        if (board.getPiece(num) == '-') {
                            board.addPiece(piecel[piecec], num);
                            if (user == 1) {
                                System.out.println("[Message] Player 1 placed a piece at " + num + " [" + (x+1) + "," + (y+1) + "]");
                            } else {
                                System.out.println("[Message] Player 2 placed a piece at " + num + " [" + (x+1) + "," + (y+1) + "]");
                            }
                            break;
                        } else {
                            System.out.println("[ERROR] This coordinate is already taken.");
                        }
                    }
                }
                // check if win
                if (board.win()) {
                    if (user == 1) {
                        System.out.println("[Message] Player 1 wins!");
                    } else if (mode == 2) {
                        System.out.println("[Message] Computer wins!");
                    } else {
                        System.out.println("[Message] Player 2 wins!");
                    }
                    board.print();
                    System.out.println("Game over.");
                    break;
                }
                // shift piece and user
                count++;
                user = user % 2 + 1;
                piecec = piecec % 2 + 1;
            }
        }
    }
}
