class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                j=0;
            }
            else j++;
            if(j> max) max=j;
        }
        return max;
    }
}