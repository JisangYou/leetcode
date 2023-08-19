class Solution {
    private val cache = HashMap<Int, Int>()
    fun fib(n: Int): Int {
        if (cache.containsKey(n)) {
            return cache[n]!!
        }
        val result: Int
        if (n < 2) {
            result = n
        } else {
            result = fib(n- 1) + fib(n - 2)
        }
        // keep the result in cache.
        cache[n] = result
        return result
    }
}