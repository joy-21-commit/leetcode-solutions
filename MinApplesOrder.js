/* 
Hitesh is a passionate fruit collector and has an interesting hobby of organizing his fruits in a line. He has a collection of fruit bags containing a certain number of fruits, which can be represented as an integer array `nums` (0-indexed). Every day, he ensures that each of his fruit bags contains more fruits than the one before it, thereby creating a strictly increasing order of fruit count.

However, he can only add more fruits to any bag; removing them is not an option. In a single operation, Hitesh can choose any bag and increment its fruit count by 1.

The task at hand is to determine the minimum number of operations required to make this arrangement strictly increasing. An array `nums` is strictly increasing if for all `0 <= i < nums.length - 1`, `nums[i] < nums[i+1]`. If the array contains only one bag, it is trivially in a strictly increasing order.
*/

class Solution {
  minimumOperations(nums) {
    if (nums.length === 1) {
      return 0;
    }

    let count = 0;
    for (let i = 0; i < nums.length - 1; i++) {
      if (nums[i + 1] === nums[i]) {
        count += 1;
        nums[i + 1]++;
      } else if (nums[i + 1] < nums[i]) {
        count += nums[i] + 1 - nums[i + 1];
        nums[i + 1] = nums[i] + 1;
      }
    }

    return count;
  }
}
