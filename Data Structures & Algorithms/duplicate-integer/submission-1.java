class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        Set<Integer> duplicate = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(duplicate.contains(nums[i])){
                return true;
            }
            duplicate.add(nums[i]);
        }

        return false;
    }
}