class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet<>();

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                char c=board[row][col];

               if (c == '.') continue;

                String rowKey=c+"rowkey"+row;
                String colKey=c+"colkey"+col;
                String boxKey=c+"boxKey"+row/3+"-"+col/3;

                if(seen.contains(rowKey)||seen.contains(colKey)||seen.contains(boxKey)){
                    return false;
                }
                seen.add(rowKey);
                seen.add(colKey);
                seen.add(boxKey);
            }
        }
        return true;
    }
}
