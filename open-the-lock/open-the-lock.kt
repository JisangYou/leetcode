class Solution {
    fun openLock(deadends: Array<String>, target: String): Int {
        val deadendSet = deadends.toSet()
        val queue: Queue<String> = LinkedList()
        val visited = mutableSetOf<String>()

        queue.offer("0000")
        visited.add("0000")
        var turns = 0

        while (queue.isNotEmpty()) {
            val size = queue.size

        repeat(size) {
            val current = queue.poll()

            if (current == target) {
                return turns
            }

            if (current in deadendSet) {
                return@repeat
            }

            for (i in 0 until 4) {
                for (j in listOf(-1, 1)) {
                    val digit = ((current[i] - '0') + j + 10) % 10
                    val newLock = current.substring(0, i) + digit + current.substring(i + 1)

                    if (newLock !in visited) {
                        visited.add(newLock)
                        queue.offer(newLock)
                    }
                }
            }
        }

        turns++
    }

    return -1
    }
}