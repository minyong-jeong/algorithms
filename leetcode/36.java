/*
    https://leetcode.com/problems/valid-sudoku/
    36. Valid Sudoku (Medium)
*/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        // row
        for (int i = 0; i < 9; i++) {
            int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    arr[num-1]++;
                    if (arr[num-1] > 1) {
                        return false;
                    }
                }
            }
        }
        
        // col
        for (int j = 0; j < 9; j++) {
            int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    arr[num-1]++;
                    if (arr[num-1] > 1) {
                        return false;
                    }
                }
            }
        }
        
        // 3 X 3 box
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        if (board[x][y] != '.') {
                            int num = board[x][y] - '0';
                            arr[num-1]++;
                            if (arr[num-1] > 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        
        return true;
    }
}