class Solution {
    fun dominantIndex(nums: IntArray): Int {
        val tempArr = nums.sortedArray()
        var result = -1

        if (nums.count() <= 1) {
            return 0
        }

        if (tempArr[tempArr.lastIndex] >= tempArr[tempArr.lastIndex - 1].times(2)) {
            nums.mapIndexed { index, i ->
                if (i == tempArr[tempArr.lastIndex]) {
                    result = index
                }
            }
        }
        return result
    }
}