class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hash.containsKey(nums[i])) {
                int previousIndex = hash.get(nums[i]);

                if (i - previousIndex <= k) {
                    return true;
                }
            }
            hash.put(nums[i], i);
        }

        return false;
    }
}