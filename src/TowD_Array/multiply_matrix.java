package TowD_Array;

public class multiply_matrix {
    public static void main(String[] args) {

            // Given matrices
            int[][] A = {
                    {1, 2},
                    {3, 4}
            };

            int[][] B = {
                    {5, 6},
                    {7, 8}
            };

            int rowsA = A.length;
            int colsA = A[0].length;
            int colsB = B[0].length;

            int[][] C = new int[rowsA][colsB];

            // Matrix multiplication
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Print result
            System.out.println("Resultant Matrix:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


