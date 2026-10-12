class Solution {

    public static void swap(int[][] arr, int r1, int c1, int r2, int c2) {
        int temp = arr[r1][c1];
        arr[r1][c1] = arr[r2][c2];
        arr[r2][c2] = temp;
    }

    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                swap(matrix, i, j, j, i);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                swap(matrix, i, j, i, n-1-j);
            }
        }
    }
}