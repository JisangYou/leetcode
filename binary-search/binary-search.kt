class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.lastIndex
        var mid = 0
        while (low <= high) {
            mid = (low + high) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] > target -> high = mid - 1
                else -> low = mid + 1
            }
        }
        return -1
    }
}