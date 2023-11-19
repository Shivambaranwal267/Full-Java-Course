 public int cherryPickup(int[][] grid) {
        int[][][]dp = new int[grid.length][grid[0].length][grid.length];
        int ans = cherryPickuphelper(grid,0,0,0,dp);

        if(ans == Integer.MIN_VALUE){
            return 0;
        }else{
            return ans;
        }
    }

    //row1 + col1 == row2 + col2 ==> col2 = row1 + col1 - row2
    public int cherryPickuphelper(int[][] grid,int row1,int col1,int row2,int[][][]dp){
        int col2 = row1 + col1 - row2;
        if(row1>=grid.length || row2>= grid.length || col1 >= grid[0].length|| col2 >= grid[0].length || grid[row1][col1] == -1||grid[row2][col2] == -1){
            return Integer.MIN_VALUE;
        }

        if(dp[row1][col1][row2] != 0){
            return dp[row1][col1][row2];
        }
        
        if(row1 == grid.length -1 && col1 == grid[0].length -1 && row2 == grid.length -1 && col2 == grid[0].length -1){
            return grid[row1][col1];
        }

        int temp1 = cherryPickuphelper(grid,row1,col1+1,row2,dp);
        int temp2 = cherryPickuphelper(grid,row1+1,col1,row2+1,dp);
        int temp3 = cherryPickuphelper(grid,row1,col1+1,row2+1,dp);
        int temp4 = cherryPickuphelper(grid,row1+1,col1,row2,dp);

        int max = Math.max(Math.max(temp1,temp2),Math.max(temp3,temp4));

        int contri = 0;
        if(row1 == row2 && col1 == col2){
            contri = grid[row1][col1];
        }else{
            contri = grid[row1][col1]+grid[row2][col2];
        }

        if(max == Integer.MIN_VALUE){
            dp[row1][col1][row2] = Integer.MIN_VALUE;
            return Integer.MIN_VALUE;

        }else{
             dp[row1][col1][row2] = max+contri;
             return max+contri;
        }
    }
