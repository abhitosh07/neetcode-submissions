class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> checkDup=new HashSet<>(); 
        for(int i=0;i<nums.length;i++)
        {
            if(checkDup.contains(nums[i]))
            return true;

            checkDup.add(nums[i]);

        }
        return false;
        
    }
}