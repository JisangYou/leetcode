class MinStack() {

    var stack: Stack<Int> = Stack()
    fun push(value: Int) {
        stack.push(value)
    }

    fun pop() {
        if (!stack.isEmpty()) {
            stack.pop()
        }
    }

    fun top(): Int {
        return if (!stack.isEmpty()) {
            stack.peek()
        } else {
            -1
        }
    }

    fun getMin(): Int {
        var result = stack[0]
        for (i in stack.indices) {
            if (result > stack[i]) {
                result = stack[i]
            }
        }
        return result
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */