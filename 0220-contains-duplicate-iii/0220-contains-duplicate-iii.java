class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (nums == null || nums.length < 2 || indexDiff <= 0 || valueDiff < 0) {
            return false;
        }

        Map<Long, Long> buckets = new HashMap<>();
        long width = (long) valueDiff + 1;

        for (int i = 0; i < nums.length; i++) {
            long val = (long) nums[i];
            long bucketId = getBucketId(val, width);

            if (buckets.containsKey(bucketId)) {
                return true;
            }

            if (buckets.containsKey(bucketId - 1) && Math.abs(val - buckets.get(bucketId - 1)) <= valueDiff) {
                return true;
            }

            if (buckets.containsKey(bucketId + 1) && Math.abs(val - buckets.get(bucketId + 1)) <= valueDiff) {
                return true;
            }

            buckets.put(bucketId, val);

            if (i >= indexDiff) {
                long oldBucketId = getBucketId((long) nums[i - indexDiff], width);
                buckets.remove(oldBucketId);
            }
        }

        return false;
    }

    private long getBucketId(long val, long width) {
        return val >= 0 ? val / width : ((val + 1) / width) - 1;
    }
}