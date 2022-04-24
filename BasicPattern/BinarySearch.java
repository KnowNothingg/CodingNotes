package BasicPattern;

class Solution {
    public int search(int[] nums, int target) {        
        int start = 0;
        int end = nums.length - 1; 
        while(start <= end) {
            int mid = start + (end - start) / 2;      // ( start + end ) / 2 might cause overflow. 
            
            if (target == nums[mid])    return mid;
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
