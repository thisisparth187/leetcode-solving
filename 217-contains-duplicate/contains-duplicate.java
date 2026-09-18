class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        int n = nums.length;
        boolean unique = false;
        for (int i = 0; i < n; i++) {
            if (hash.contains(nums[i])) {
                return true;
            }
            else{
                hash.add(nums[i]);
            }
        }
        return unique;
    }
}