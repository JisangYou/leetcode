class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val tempStr: StringBuilder = StringBuilder()
        val tempIntArrayList = ArrayList<Int>()
        digits.map {
            tempStr.append(it).trim()
        }
        tempStr
            .toString()
            .toBigInteger()
            .plus(BigInteger("1"))
            .toString()
            .split("")
            .filter { element -> element.isNotEmpty() }
            .map { elementStr -> tempIntArrayList.add(elementStr.toInt()) }

        return tempIntArrayList.toIntArray()
    }
}