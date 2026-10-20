class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);              
        int sum = 0, res = 0;
        for (int x : nums) {
            sum += x;
            res += count.getOrDefault(sum - k, 0);
            count.merge(sum, 1, Integer::sum);
        }
        return res;
    }
}