//https://leetcode.com/problems/rotate-image/submissions/950297687/
import java.util.*;
class Solution {
    public void rotate(int[][] matrix) {
        Scanner sc=new Scanner(System.in);
        int n=matrix.length;
        int temp;
        //TRANSPOSE
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i==j){
                    continue;
                }else{
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        //REVERSE ROWS
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[i][(n-1)-j];
                    matrix[i][(n-1)-j]=temp;
            }
        }
    }
}
