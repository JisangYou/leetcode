class MyHashMap() {

    /** Initialize your data structure here. */
    var hashMap = HashMap<Int,Int>()

    /** value will always be non-negative. */
    fun put(key: Int, value: Int) {
        hashMap.put(key,value)
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    fun get(key: Int): Int {
        val result = if (hashMap.contains(key)) {
            hashMap[key]
        } else {
            -1
        }
        return result!!
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    fun remove(key: Int) {
        hashMap.remove(key)
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */