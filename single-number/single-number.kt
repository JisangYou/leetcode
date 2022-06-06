class Solution {
    fun singleNumber(nums: IntArray): Int {
        return nums
            .groupBy { it }
            .filter { it.value.size == 1 }
            .flatMap { it.value }
            .first()
    }
}