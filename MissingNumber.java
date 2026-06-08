/* 
## Problem Title: Missing Number

### Problem Description:

Given an array `nums` containing `n` distinct numbers in the range (\[0, n\]), return the only number in the range that is missing from the array.
*/

import java.util.Arrays;

class Solution {

  public int findMissingNumber(int[] nums) {
    int lp = 0;
    int rp = 1;

    Arrays.sort(nums);
    while (rp < nums.length) {
      if (nums[rp] - nums[lp] > 1) {
        return (nums[lp] + 1);
      }
      lp++;
      rp++;
    }

    return nums.length;
  }
}
