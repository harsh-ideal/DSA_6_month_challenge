class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(
                isValidForRow(board,i,j)==false||
                isValidForCol(board,i,j)==false||
                isValidForBox(board,i,j)==false){
                    System.out.println(isValidForRow(board,i,j));
                    System.out.println(i+""+j);
                    System.out.println(isValidForCol(board,i,j));
                    System.out.println(isValidForBox(board,i,j));
                    return false;
                }   
            } 
        }
        return true;
    }

    boolean isValidForRow(char[][] board,int row,int col){
        for(int i=row+1;i<9;i++){
            if(board[i][col]==board[row][col])
                return false;
        }
        return true;
    }

    boolean isValidForCol(char[][] board,int row,int col){
        for(int i=col+1;i<9;i++){
            if(board[row][i]==board[row][col]){
                return false;
            }
        }
        return true;
    }

    boolean isValidForBox(char[][] board,int row,int col){
        int lrow=-1,lcol=-1;
        switch(row/3){
            case 0:
                lrow=2;
                break;
            case 1:
                lrow=5;
                break;
            case 2:
                lrow=8;
                break;    
        }
        switch(col/3){
            case 0:
                lcol=2;
                break;
            case 1:
                lcol=5;
                break;
            case 2:
                lcol=8;
                break; 
        }
        for(int i=lrow-2;i<=lrow;i++){
            for(int j=lcol-2;j<=lcol;j++){
                if(i==row&&j==col)
                    continue;
                if(board[i][j]==board[row][col])
                    return false;
            }
        }
        return true;
    }
}

Link:https://leetcode.com/problems/valid-sudoku/