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