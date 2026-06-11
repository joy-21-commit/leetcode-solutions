/* 
You are given a **0-indexed** integer array `nums` and an integer `k`. Your task is to perform the following operation **exactly** `k` times in order to maximize your score:

1. Select an element `m` from `nums`.
2. Remove the selected element `m` from the array.
3. Add a new element with a value of `m + 1` to the array.
4. Increase your score by `m`.

Return *the maximum score you can achieve after performing the operation exactly* `k` *times.*
*/

import java.util.Arrays;

class Solution {

  public int maximizeSum(int[] nums, int k) {
    int count = k;
    Arrays.sort(nums);
    int score = 0;
    while (count > 0) {
      score += nums[nums.length - 1];
      nums[nums.length - 1] += 1;
      count--;
    }
    return score;
  }
}
