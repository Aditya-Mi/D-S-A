class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
          for (int i = 0; i < nums.length; i++) {
              if (!window.add(nums[i])) return true;   // already in window → duplicate
              if (window.size() > k) {
                  window.remove(nums[i - k]);          // drop the value that fell out of range
              }
          }
          return false;
    }
}