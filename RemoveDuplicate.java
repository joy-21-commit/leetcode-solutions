/* 
Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be maintained. Return the number of unique elements in `nums`.

Consider the number of unique elements of `nums` to be `k`. To be accepted, you need to do the following:

- Modify the array `nums` such that the first `k` elements contain the unique elements in the initial order of `nums`.
- The remaining elements beyond `k` are irrelevant.
- Return `k`.
*/

class Solution {
    
    public int removeDuplicates(int[] nums) {
        int lp = 0, rp = 1;
        int idx = 0;

        while (rp < nums.length) {
            if (nums[lp] != nums[rp]) {
                nums[idx] = nums[lp];
                lp = rp;
                rp++;
                idx++;
            } else {
                rp++;
            }

            if (rp == nums.length) {
                nums[idx] = nums[lp];
            }
        }

        
        return (idx + 1);
    }
}