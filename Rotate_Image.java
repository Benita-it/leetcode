#48. Rotate Image

🔗 Problem Link (https://leetcode.com/problems/rotate-image/)
📁 Topic: Arrays, Matrix Manipulation

Steps:
1️⃣ Transpose the matrix → swap matrix[i][j] with matrix[j][i].
2️⃣ Reverse each row → for each row, swap elements from start to end.

Time Complexity: O(n²)
Space Complexity: O(1) (in-place)

import java.util.*;
import java.io.*;

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}