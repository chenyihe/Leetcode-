class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        Map map = new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(target-nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            if(map.get(nums[j])!=null&&(int)map.get(nums[j])!=j){
                result[0]=(int)map.get(nums[j]);
                result[1]=j;
            }
        }
        return result;
        
    }
}
