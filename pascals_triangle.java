118.Pascal’s Triangle
**List<List<Integer>> is used to store all rows of Pascal’s Triangle, where each row is a list of integers.**

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
       
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);  // First element is always 1

        for (int j = 1; j < i; j++) {
            int sum = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
            row.add(sum);
        }

        if (i > 0) row.add(1);  // Last element is 1 if row has more than 1 element
        result.add(row);
    }

    return result;
}

    }
// **Time Complexity**: O(n^2)