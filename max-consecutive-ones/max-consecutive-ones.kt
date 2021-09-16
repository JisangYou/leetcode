class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var result = 0
        for (i in nums.indices) {
            if (nums[i] == 1) {
                max++
                if (max > result) {
                    result = max
                }
            } else {
                max = 0
            }
        }
        return result
    }
}