class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val hashMap = HashMap<Char, Char>()
        val hashSet1 = HashSet<Char>()
    val hashSet2 = HashSet<Char>()
        var temp = ""
        if (s.length != t.length) return false
        s.map { hashSet1.add(it) }
    t.map { hashSet2.add(it) }
    if (hashSet1.count() != hashSet2.count()) return false
        s.mapIndexed { i, char ->
            hashMap[char] = t[i]
        }

        s.map { char ->
        hashMap.map { i ->
            if (char == i.key) {
                temp += i.value
            }
        }
     }

        return temp == t
    }
}