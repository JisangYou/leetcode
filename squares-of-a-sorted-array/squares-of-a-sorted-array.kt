class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        return nums.map { i -> i * i }.sorted().toIntArray()
    }
}