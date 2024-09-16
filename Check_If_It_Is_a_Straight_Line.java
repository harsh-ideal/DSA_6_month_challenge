class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
      
        if (coordinates.length <= 2) {
            return true;
        }
        
        
        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];
        
        
        for (int i = 2; i < coordinates.length; i++) {
            int xDiffNew = coordinates[i][0] - coordinates[i - 1][0];
            int yDiffNew = coordinates[i][1] - coordinates[i - 1][1];
            
     
            if (yDiff * xDiffNew != yDiffNew * xDiff) {
                return false;
            }
        }
        
        return true;
    }
}

Link: https://leetcode.com/problems/check-if-it-is-a-straight-line/