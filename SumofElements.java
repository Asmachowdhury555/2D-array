public class asma {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0; // Variable to store the sum

        // Loop through each row
        for (int i = 0; i < numbers.length; i++) { 
            // Loop through each column in the current row
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j]; // Add the element to sum
            }
        }

        // Print the total sum
        System.out.println("Sum of all elements: " + sum);
    }
}
