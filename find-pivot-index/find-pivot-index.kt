class Solution {
    fun pivotIndex(nums: IntArray): Int {
    var pivot = 0
    var idx = -1
    var left = 0
    var right = 0

    for (i in nums.indices) {
        for (l in pivot downTo 0) {
            left += nums[l]
        }

        for (r in pivot until nums.size) {
            right += nums[r]
        }

        if (left != right) {
            pivot++
            left = 0
            right = 0
        } else {
            idx = pivot
        }
    }
    return idx
    }
}