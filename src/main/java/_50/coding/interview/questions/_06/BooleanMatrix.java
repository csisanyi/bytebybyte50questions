package _50.coding.interview.questions._06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooleanMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        List<Integer> rowIsTrue = new ArrayList<>();
        List<Integer> colIsTrue = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    if (!rowIsTrue.contains(i)) {
                        rowIsTrue.add(i);
                    }
                    if (!colIsTrue.contains(j)) {
                        colIsTrue.add(j);
                    }
                }
            }
        }

        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (colIsTrue.contains(j) || rowIsTrue.contains(i)) {
                    result[i][j] = 1;

                } else {
                    result[i][j] = 0;
                }
                System.out.print(result[i][j]);
            }
            System.out.print("\n");
        }



    }
}
