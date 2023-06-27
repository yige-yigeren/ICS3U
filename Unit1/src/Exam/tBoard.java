package Exam;

public class tBoard{

    private tPiece[][] board;
    
    public tBoard() {
        board = new tPiece[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new tPiece('-');
            }
        }   
    }
    
    // Print board
    void print() {
        System.out.println("┏━━━━━━━━━━━━━┓");
        for (int i = 0; i < 3; i++) {
            System.out.print("┃ ");
            for (int j = 0; j < 3; j++) {
                System.out.print("-" + board[i][j].getLetter() + "- ");
            }
            System.out.println("┃");
        }
        System.out.println("┗━━━━━━━━━━━━━┛");
    }

    // Add piece to board
    void addPiece(char a, int b) {
        if (b < 1 || b > 9) {
            return;
        }
        int x = (b - 1) / 3;
        int y = (b - 1) % 3;
        board[x][y].setLetter(a);
    }
    
    // Get piece from board
    char getPiece(int b) {
        if (b < 1 || b > 9) {
            return ' ';
        }
        int x = (b - 1) / 3;
        int y = (b - 1) % 3;
        return board[x][y].getLetter();
    }

    // Check is win or not
    boolean win() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].getLetter() == board[i][1].getLetter() && board[i][1].getLetter() == board[i][2].getLetter() && board[i][0].getLetter() != '-') {
                return true;
            }
            if (board[0][i].getLetter() == board[1][i].getLetter() && board[1][i].getLetter() == board[2][i].getLetter() && board[0][i].getLetter() != '-') {
                return true;
            }
        }
        if (board[0][0].getLetter() == board[1][1].getLetter() && board[1][1].getLetter() == board[2][2].getLetter() && board[0][0].getLetter() != '-') {
            return true;
        }
        if (board[0][2].getLetter() == board[1][1].getLetter() && board[1][1].getLetter() == board[2][0].getLetter() && board[0][2].getLetter() != '-') {
            return true;
        }
        return false;
    }  
}