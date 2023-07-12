class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var first = -1
        var second = -1
        for (i in 0 until nums.count()) {
            for (j in i until nums.count()) {
                if (target == nums[i]+nums[j] && i != j) {
                    first = i
                    second = j
                }
            }
        }
        return intArrayOf(first,second)
    }
}