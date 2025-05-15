// class Solution {
//     public int[][] transpose(int[][] matrix) {
//          int m=matrix.length;int n=matrix[0].length;
//          int transpose [][]=new int [m][n];
//          for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 transpose [i][j]=matrix[j][i];
//             }
//          } 
//          return transpose ;
//     }
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;       
        int n = matrix[0].length;   
        int[][] transpose = new int[n][m]; 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
}
