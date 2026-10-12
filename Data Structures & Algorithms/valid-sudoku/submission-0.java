class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> row = new HashSet<>();
        Set<String> col = new HashSet<>();
        Set<String> box = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = board[i][j];

                if (num == '.') continue;
                
                if (!row.add(num + "at row" + i) ||        
                    !col.add(num + "at col" + j) ||
                    !box.add(num + "at box" + i/3 + "," + j/3)) {
                        return false;
                    }    
            }
        }
        return true;
    }
}
