
//// MEDIUM ////
///// Validate Sudoku
import java.util.HashSet;

public class Question36 {
    public static void main(String[] args) {
        char[][] input = { { '5', '5', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        System.out.println(isValidSudoku(input));
    }

    static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<String>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char currentItem = board[i][j];
                if (currentItem != '.') {
                    if ((!seen.add(currentItem + "found in row " + i))
                            || (!seen.add(currentItem + "found in column " + j))
                            || (!seen.add(currentItem + "found in box " + i / 3 + "-" + j / 3)))
                        return false;
                }
            }
        }
        return true;
    }
}
