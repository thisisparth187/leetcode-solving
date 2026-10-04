class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p = 0;
        int n = 1;
        int[] n2 = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                n2[p] = nums[i];
                p+=2;
            }
            else{
                n2[n] = nums[i];
                n += 2;
            }
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = n2[i];
        }
        System.gc();
        return nums;
    }
}