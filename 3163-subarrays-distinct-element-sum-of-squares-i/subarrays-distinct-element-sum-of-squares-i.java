class Solution {
    public int sumCounts(List<Integer> nums) {
        int total = 0;
        int n = nums.size();
        
        for (int i = 0; i < n; i++) {
            Set<Integer> dist = new HashSet<>();
            
            for (int j = i; j < n; j++) {
                dist.add(nums.get(j));
                
                int count = dist.size();
                total += count * count;
            }
        }
        
        return total;
    }
}