/*
    https://leetcode.com/problems/valid-tic-tac-toe-state/
    794. Valid Tic-Tac-Toe State (Medium)
*/
class Solution {
    public boolean validTicTacToe(String[] board) {
        int oCount = 0;
        int xCount = 0;
        int oComplete = 0;
        int xComplete = 0;
        for (int i = 0; i < 3; i++) {
            // -
            if (board[i].charAt(0) == board[i].charAt(1) && board[i].charAt(1) == board[i].charAt(2)) {
                if (board[i].charAt(0) == 'O') {
                    oComplete++;
                } else if (board[i].charAt(0) == 'X') {
                    xComplete++;
                }
            }
            
            // |
            if (board[0].charAt(i) == board[1].charAt(i) && board[1].charAt(i) == board[2].charAt(i)) {
                if (board[0].charAt(i) == 'O') {
                    oComplete++;
                } else if (board[0].charAt(i) == 'X') {
                    xComplete++;
                }
            }
            
            // Counting O/X 
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'O') {
                    oCount++;
                } else if (board[i].charAt(j) == 'X') {
                    xCount++;
                }
            }
        }
        
        // X
        if ((board[0].charAt(0) == 'O' && board[1].charAt(1) == 'O' && board[2].charAt(2) == 'O')
            || (board[0].charAt(2) == 'O' && board[1].charAt(1) == 'O' && board[2].charAt(0) == 'O')) {
            oComplete++;
        }
        if ((board[0].charAt(0) == 'X' && board[1].charAt(1) == 'X' && board[2].charAt(2) == 'X')
            || (board[0].charAt(2) == 'X' && board[1].charAt(1) == 'X' && board[2].charAt(0) == 'X')) {
            xComplete++;
        }
        
        // Wrong count case 
        if (oCount > xCount || xCount - oCount > 1) {
            return false;
        }
        
        // Wrong complete case 
        if (oComplete > 0 && xComplete > 0) {
            return false;
        }
        if (xComplete == 1 && oCount == xCount) {
            return false;
        }
        if (oComplete == 1 && oCount < xCount) {
            return false;
        }
        
        return true;
    }
}