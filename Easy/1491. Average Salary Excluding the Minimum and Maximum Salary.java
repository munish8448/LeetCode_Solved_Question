class Solution {
  
    public double average(int[] salary) {
        // for comparison to get maximum and minimum 
        double max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        // get maximum and minimum from salary[]
        for(double val : salary){
            if(max < val){
                max = val;
            }
            if(min > val){
                min = val;
            }
        }
   
        double sum=0;
      
        for(double val :salary){
            // get the sum of all elements of array except max and min
            if(val == min || val == max){
                continue;
            }else{
                sum+=val;
            }
        }
        
        // return the average value
        return sum/(salary.length - 2);
    }
}
