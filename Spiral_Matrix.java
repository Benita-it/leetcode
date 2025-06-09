#54. Spiral Matrix

🔗 Problem Link (https://leetcode.com/problems/spiral-matrix/)
📁 Topic: Matrix, Simulation

✅ Steps
Initialize boundaries:
top = 0, bottom = matrix.length - 1
left = 0, right = matrix[0].length - 1

Traverse in 4 directions:

➡️ Left → Right: traverse top row, then top++

⬇️ Top → Bottom: traverse right column, then right--

⬅️ Right → Left: if top <= bottom, traverse bottom row, then bottom--

⬆️ Bottom → Top: if left <= right, traverse left column, then left++

Repeat until all boundaries cross.

💡 Example
Input:

matrix = [
 [1, 2, 3],
 [4, 5, 6],
 [7, 8, 9]
]
Output:

[1, 2, 3, 6, 9, 8, 7, 4, 5]
⏱️ Time Complexity:
O(m * n) — where m = rows, n = columns

📦 Space Complexity:
O(1) — extra space (excluding result list)

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Top row
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Bottom row
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // Left column
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}

