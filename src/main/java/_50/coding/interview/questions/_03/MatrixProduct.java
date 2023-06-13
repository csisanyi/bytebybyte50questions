package _50.coding.interview.questions._03;

import java.util.Scanner;

public class MatrixProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if (n == 0 || m == 0) {
            System.out.println("Invalid matrix");
        }

        multiply(matrix);

    }

    private static void multiply(int[][] matrix) {
        int starter = matrix[0][0] * 1;
        if (matrix[1][0] * starter <= matrix[0][1] * starter) {
             multiply(matrix, 1, 0, starter, 0, 0);
        } else {
             multiply(matrix, 0, 1, starter, 0, 0);
        }
    }

    private static void multiply(int[][] matrix, int n, int m, int starter, int posX, int posY) {
        if (n > m) {
            if (posX < matrix[posY].length - 1) {
                multiply(matrix, 1, 0, starter * matrix[posY][posX + 1], posX + 1, posY);
            } else if (posY < matrix.length - 1) {
                multiply(matrix, 0, 1, starter * matrix[posY + 1][posX], posX, posY + 1);
            } else {

                System.out.println(starter);
            }
        } else {
            if (posY < matrix.length - 1) {
                multiply(matrix, 0, 1, starter * matrix[posY + 1][posX], posX, posY + 1);
            } else if (posX < matrix[posY].length - 1) {
                multiply(matrix, 1, 0, starter * matrix[posY][posX + 1], posX + 1, posY);
            } else {
                System.out.println(starter);
            }
        }

    }

}
