class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i])+1);
            }
            else{
                hash.put(nums[i], 1);
            }
        }

        boolean unique = false;

        for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
            if(entry.getValue() > 1){
                unique = true;
            }
        }
        return unique;
    }
}