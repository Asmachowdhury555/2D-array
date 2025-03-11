public class asma{
    public static void main(String[] args) {
        // First matrix (A)
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Second matrix (B)
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Get dimensions
        int rowA = A.length;    // Rows in A
        int colA = A[0].length; // Columns in A
        int rowB = B.length;    // Rows in B
        int colB = B[0].length; // Columns in B

        // Check if multiplication is possible
        if (colA != rowB) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        // Result matrix to store multiplication output
        int[][] result = new int[rowA][colB];

        // Performing matrix multiplication
        for (int i = 0; i < rowA; i++) {  // Loop through rows of A
            for (int j = 0; j < colB; j++) {  // Loop through columns of B
                for (int k = 0; k < colA; k++) {  // Perform multiplication and sum
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Printing the result matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
