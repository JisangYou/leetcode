class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int =
        nums.sortedDescending()[k - 1]
}