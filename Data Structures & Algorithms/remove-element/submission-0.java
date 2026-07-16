class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int n = nums.length;
        
        while(start < n){
            if(nums[start] == val){
                nums[start] = nums[n - 1];
                n--;
            } else {
                start++;
            }
        }

        return n;
    }
}