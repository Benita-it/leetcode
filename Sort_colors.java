#75. Sort Colors
🔗 Problem Link
📁 Topic: Two Pointers, Sorting, Dutch National Flag Algorithm

nums[i] == 0 → swap with left (l++) and move i
nums[i] == 1 → just move i
nums[i] == 2 → swap with right (r--) but dont move i

Time Complexity: O(n)
Space Complexity: O(1)

import java.util.*;

class Solution {
  public void sortColors(int[] nums) {
    int l = 0;
    int r = nums.length - 1;

    for (int i = 0; i <= r;)
      if (nums[i] == 0)
        swap(nums, i++, l++);
      else if (nums[i] == 1)
        ++i;
      else
        swap(nums, i, r--);
  }

  private void swap(int[] nums, int i, int j) {
    final int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}