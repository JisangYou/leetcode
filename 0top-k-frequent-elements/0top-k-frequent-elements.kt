class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val list = mutableMapOf<Int, Int>()
        nums.groupBy { it }.map { list.put(it.key, it.value.count()) }
        return list.toList().sortedWith(compareBy { it.second }).takeLast(k).map { it.first
        }.toIntArray()
    }
}