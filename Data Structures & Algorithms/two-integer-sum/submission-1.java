class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> checkMap = new HashMap<>();
        for (int i =0; i <nums.length; i++){
            int req = target-nums[i];
            if(checkMap.containsKey(req) && i!= checkMap.get(req)){
                return new int[]{checkMap.get(req),i};
            }
            checkMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
