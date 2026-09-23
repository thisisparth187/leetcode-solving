class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] pair = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length;i++) {
            int diff = target - nums[i];
            if(hash.containsKey(diff)){
                int i1 = hash.get(diff);
                System.out.println(i1 + " " + i);
                pair[0] = i1;
                pair[1] = i;
                
            }
            hash.put(nums[i], i);
        }
        return pair;
    }
}