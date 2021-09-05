import kotlin.math.abs

class Solution {
    fun reverse(x: Int): Int {
        val temp = abs(x).toString().reversed().toCharArray()
        var result: String = ""
        val minus = '-'
        val zero = '0'
        var isFirstZero = true

        if (temp.size == 1 && temp.first() == zero) {
            return zero.toString().toInt()
        }

        for (i in temp.indices) {
            if (temp[i] == '0' && isFirstZero) {
            } else {
                isFirstZero = false
                result += temp[i].toString()
            }
        }

        if (x < 0) {
            result = minus + result
        }

        return try {
            result.toInt()
        } catch (e: NumberFormatException) {
            0
        }
    }
}