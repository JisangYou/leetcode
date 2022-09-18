class Solution {
    fun reverseString(s: CharArray): Unit {
        // s.reverse()
        val midPoint = (s.size / 2) - 1
        if (midPoint < 0) return
        var reverseIndex = s.lastIndex
        for (index in 0..midPoint) {
            val tmp = s[index]
            s[index] = s[reverseIndex]
            s[reverseIndex] = tmp
            reverseIndex--
        }
    }
}