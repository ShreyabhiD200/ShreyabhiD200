class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map<Integer, Integer> mp = new HashMap<>();
        
        // for (int i = 0; i < nums.length; i++) {
        //     int a = nums[i];
        //     int more = target - a;
            
        //     if (mp.containsKey(more)) {
        //         return new int[]{mp.get(more), i};
        //     }
            
        //     mp.put(a, i);
        // }
        
        // return new int[]{}; 

        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            int required = target-nums[i];
            for(int j=1;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[j]==required){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return new int[]{};

        
    }
}