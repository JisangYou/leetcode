class Solution {
    private val cache = HashMap<Int, Int>()
    fun climbStairs(n: Int): Int {
        if (cache.containsKey(n)) {
            return cache[n]!!
        }
        val result: Int
        if (n <= 2) {
            result = n
        } else {
            result = climbStairs(n - 1) + climbStairs(n - 2)
        }
        // keep the result in cache.
        cache[n] = result
        return result
    }
}


//    if (n <= 2) {
//         return n
//     }

//     var prev1 = 1   // n-1 계단을 오르는 방법의 수
//     var prev2 = 2   // n-2 계단을 오르는 방법의 수
//     var curr = 0    // n 계단을 오르는 방법의 수

//     // 3부터 n까지 반복하며 계단을 오르는 방법의 수를 구합니다.
//     for (i in 3..n) {
//         curr = prev1 + prev2   // 현재 계단을 오르는 방법은 n-1과 n-2 계단을 오르는 방법의 합
//         prev1 = prev2          // n-1 계단을 오르는 방법의 수를 n-2 계단으로 업데이트
//         prev2 = curr           // n 계단을 오르는 방법의 수를 n-1 계단으로 업데이트
//     }

//     return curr   // n 계단을 오르는 방법의 수를 반환