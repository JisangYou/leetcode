class MyCircularQueue(k: Int) {
    var k = k
    var queue: Queue<Int> = LinkedList()

    fun enQueue(value: Int): Boolean {
        return if (queue.size == k) {
            false
        } else {
            queue.add(value)
        }
    }

    fun deQueue(): Boolean {
        return if (queue.isEmpty()) {
            false
        } else {
            queue.remove(queue.first())
        }
    }

     fun Front(): Int {
        return if (queue.isEmpty()) {
            -1
        } else {
            queue.peek()
        }
    }

    fun Rear(): Int {
        return if (queue.isEmpty()) {
            -1
        } else {
            queue.elementAt(queue.size - 1)
        }

    }

    fun isEmpty(): Boolean {
        return queue.size == 0
    }

    fun isFull(): Boolean {
        return queue.size == k
    }


}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * var obj = MyCircularQueue(k)
 * var param_1 = obj.enQueue(value)
 * var param_2 = obj.deQueue()
 * var param_3 = obj.Front()
 * var param_4 = obj.Rear()
 * var param_5 = obj.isEmpty()
 * var param_6 = obj.isFull()
 */