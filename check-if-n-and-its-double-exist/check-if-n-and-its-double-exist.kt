import kotlin.math.abs

class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
    val arr1 = arr.sorted()
    val arr2 = arr.sorted()

    arr1.mapIndexed { i, outer ->
        arr2.mapIndexed { j, inner ->
            if (i != j && outer * 2 == inner) {
                return true
            }
        }
    }
    return false
    }
}