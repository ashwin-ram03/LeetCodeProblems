class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] new_array = new int[2];
        for(int i =0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    //new_array[0]=nums[i]; these get the actual numbers!
                    //new_array[1]=nums[j];
                    
                    //we want indices
                    new_array[0] = i;
                    new_array[1]=j;
                   
                }
            }
        }
         return new_array;
    }
}
