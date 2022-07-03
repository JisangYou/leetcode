class MovingAverage(private val size: Int) {
    val queue: Queue<Int> = LinkedList()
    fun next(`val`: Int): Double {
        var result = 0
        if (queue.size >= size) {
            queue.poll()
        } 
        queue.offer(`val`)
        queue.map { result += it }
        return result.toDouble()/queue.size.toDouble()
    }

}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * var obj = MovingAverage(size)
 * var param_1 = obj.next(`val`)
 */