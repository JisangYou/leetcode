class Trie() {

    private val trie = HashMap<String, String>()

    fun insert(word: String) {
        trie[word] = word
    }

    fun search(word: String): Boolean {
        return trie[word] != null
    }

    fun startsWith(prefix: String): Boolean {
        var result = false
        for (key in trie.keys) {
            if (key.startsWith(prefix)) {
                result = true
                break
            }
        }
        return result
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * var obj = Trie()
 * obj.insert(word)
 * var param_2 = obj.search(word)
 * var param_3 = obj.startsWith(prefix)
 */