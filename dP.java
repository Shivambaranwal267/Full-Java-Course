// import java.util.Arrays;

// public class dP {
    
//      public int climbStairs(int n){
        
//         int[] dp = new int[n + 1];
//         Arrays.fill(dp , -1);
//         return climbStairsHelper(n , dp);
        
//     }
//     public int climbStairsHelper(int n , int[] dp) {
      
//         if(n == 1 || n == 2){
//             return n;
//         }
        
//         if(dp[n] != -1){
//             return dp[n];
//         }

         
//         int step1 = climbStairsHelper(n - 1 , dp);
//         int step2 = climbStairsHelper(n - 2 , dp);
        
//         dp[n] = step1 + step2;
        
//         return dp[n]; 
//     }

// }

// class Solution {
//     public int numSquares(int n) {
//         int[] dp = new int[n + 1];
//         Arrays.fill(dp,-1);
//         return helper(n, dp);
//     }
    
//     public int helper(int n, int[] dp) {
//         if (n == 0 || n == 1){
//             return n;
//         }
        
//         if (dp[n] != -1)
//             return dp[n];
        
//         int smallest = Integer.MAX_VALUE;
        
//         for (int i = 1; i * i <= n; i++) {
    
//             int temp = helper(n - i*i,dp);
//             smallest = Math.min(smallest, temp);
//         }
        
//         dp[n] = smallest + 1;
//         return smallest + 1;
//     }
// }

// long numberOfPaths(int m, int n) {
//         // Code Here
//         long[][]dp = new long[m][n];
        
//         for(int i=0;i<m;i++){
//             Arrays.fill(dp[i],-1);
//         }
//        return pathshelper(m-1,n-1,dp);
//     }
    
//     public static long pathshelper(int sr, int sc,long[][] dp) {

// 	        if(sr < 0 || sc < 0) {
// 	            return 0;
// 	        }

// 	        if(sr == 0 && sc == 0) {
// 	            return 1;
// 	        }
	        
// 	        if(dp[sr][sc] != -1){
// 	            return dp[sr][sc];
// 	        }
            
		
// 			long path1 = pathshelper(sr - 1, sc,dp);
// 			long path2 = pathshelper(sr, sc - 1,dp);

// 		    dp[sr][sc] = path1 + path2;
// 		    return path1+path2;
// 	 }
    
