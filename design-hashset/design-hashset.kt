class MyHashSet() {

    /** Initialize your data structure here. */
    var hashSet = HashSet<Int>()

    fun add(key: Int) {
        hashSet.add(key)
    }

    fun remove(key: Int) {
        hashSet.remove(key)
    }

    /** Returns true if this set contains the specified element */
    fun contains(key: Int): Boolean {
        return hashSet.contains(key)
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */