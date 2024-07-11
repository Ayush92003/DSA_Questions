// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
![Sample Image](https://assets.leetcode.com/uploads/2020/08/17/mat1.jpg)
public class setMatrixZero {
    public static void print(int[][]arr){
        for(int[]ans : arr){
            for(int ele : ans) System.out.print(ele+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]arr={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
        print(arr);
    }
    public static void setZeroes(int[][] arr) {
        int n=arr.length,m=arr[0].length;
        int[]row=new int[n];
        int[]col = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1) arr[i][j]=0;
            }
        }
    }
}
