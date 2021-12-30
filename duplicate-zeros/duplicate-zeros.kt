class Solution {
    fun duplicateZeros(arr: IntArray): Unit {
        val tempList = ArrayList<Int>();
        for (i in arr.indices) {
            if (arr[i] == 0) {
                tempList.add(0)
                tempList.add(0)
            } else {
                tempList.add(arr[i])
            }
        }

        for(i in arr.indices){
            arr[i] = tempList[i]
        }
    }
}