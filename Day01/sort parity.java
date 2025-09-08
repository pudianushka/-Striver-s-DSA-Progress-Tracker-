class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;

        int[] nums2 = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                nums2[j] = nums[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                nums2[j] = nums[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = nums2[i];
        }

        return nums; 
    }
}
