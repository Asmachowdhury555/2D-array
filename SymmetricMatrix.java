import java.util.Scanner;

public class asma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking matrix size as input
        System.out.print("Enter the number of rows and columns: ");
        int n = scanner.nextInt();  // Assuming square matrix (n x n)

        int[][] matrix = new int[n][n];

        // Taking matrix elements as input
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Checking if the matrix is symmetric
        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        // Printing the result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is NOT symmetric.");
        }

        scanner.close();
    }
}
