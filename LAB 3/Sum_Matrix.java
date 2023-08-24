import java.util.Scanner;
public class Sum_Matrix {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the number of rows and columns of the matrix
        System.out.println("Enter the number of rows and columns of the matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Declare and initialize a two-dimensional array to store the matrix elements
        int[][] matrix = new int[rows][cols];

        // Read the matrix elements from the user
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Close the Scanner object
        sc.close();

        // Declare and initialize two arrays to store the row sums and column sums
        int[] rowSums = new int[rows];
        int[] colSums = new int[cols];

        // Loop through the matrix and calculate the row sums and column sums
        for (int i = 0; i < rows; i++) {
            int rowSum = 0; // Initialize the row sum to zero
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j]; // Add the current element to the row sum
                colSums[j] += matrix[i][j]; // Add the current element to the column sum
            }
            rowSums[i] = rowSum; // Store the row sum in the array
        }

        // Print the row sums and column sums
        System.out.println("The sum of each row is:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
        }

        System.out.println("The sum of each column is:");
        for (int j = 0; j < cols; j++) {
            System.out.println("Column " + (j + 1) + ": " + colSums[j]);
        }
    }
}

