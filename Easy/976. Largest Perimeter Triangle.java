class Solution {
    public int largestPerimeter(int[] nums) {
        
        /* for a triangle we need 3 sides such that sum of two smaller sides is always greater than the third. 
         *
         * p + b > h
         *
         * sort to get values such that p <= b <= h 
         * or b <= p <= h 
         */
        Arrays.sort(nums);
            
        // going from roght to left 
        // iterate on array for element-3 times
      
        for(int i = nums.length-2; i>0;i--){
            // check if triangle can be formed
            if((nums[i-1] + nums[i+0]) > nums[i+1]){
                    return (nums[i-1] + nums[i+0] + nums[i+1]);
                
            } 
        }
                        
        return 0;
    }
        
}
