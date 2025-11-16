public class TwoSum{
    public int[] twoSumSolution(int nums[],int target){
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum.put(nums[i],i);
    }
        for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if(sum.containsKey(complement)&&sum.get(complement)!=i){
            return new int[]{i, sum.get(complement)};
        }
        }
        return new int[0];
    }
}