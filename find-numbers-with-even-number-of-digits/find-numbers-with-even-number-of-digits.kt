import kotlin.math.log10

class Solution {
    fun findNumbers(nums: IntArray): Int {
        var result = 0
        for (i in nums.indices) {
            if ((log10(nums[i].toDouble()).toInt() + 1) % 2 == 0) {
                result++                
            }
        }   
        return result   
    }
}