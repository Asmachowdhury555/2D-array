import java.util.Scanner;

public class asma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Take matrix input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Step 2: Take the target number to search
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();
        
        // Step 3: Search for the element
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    found = true;
                    break; // Exit the loop if found
                }
            }
            if (found) break;
        }
        
        // Step 4: If not found, print message
        if (!found) {
            System.out.println("Element not found in the matrix.");
        }
        
        sc.close();
    }
}
