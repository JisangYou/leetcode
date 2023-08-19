class Solution {
    fun fib(n: Int): Int {
        val result: Int
        if (n < 2) {
            result = n
        } else {
            result = fib(n - 1) + fib(n - 2)
        }
        return result
    }
}