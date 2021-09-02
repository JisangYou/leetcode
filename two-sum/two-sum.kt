class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result: IntArray = intArrayOf()
        for (i in nums.indices) {
            for (j in i until nums.size) {
                if (i < j) {
                    if (nums[i] + nums[j] == target) {
                        result = intArrayOf(i, j)
                    }
                }

            }
        }

        return result
    }
}