class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.distinct().count() != nums.count()
    }
}