// javafx.application.Application;
public class Add_Matrix {
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
      int rows = matrix1.length;
      int columns = matrix1[0].length;
      if (rows != matrix2.length || columns != matrix2[0].length) {
        throw new IllegalArgumentException("Matrices must have the same dimensions");
      }
  
      int[][] result = new int[rows][columns];
  
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          result[i][j] = matrix1[i][j] + matrix2[i][j];
        }
      }
  
      return result;
    }
  
    public static void printMatrix(int[][] matrix) {
      for (int[] row : matrix) {
        for (int element : row) {
          System.out.print(element + " ");
        }
        System.out.println();
      }
    }
  
    public static void main(String[] args) {
      int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
  
      int[][] result = addMatrices(matrix1, matrix2);
      printMatrix(result);
    }
  }

