class Solution {
    fun isValid(s: String): Boolean {
      val stack = Stack<Char>()

        for (char in s) {
            when (char) {
                '(', '{', '[' -> stack.push(char)
                ')', '}', ']' -> {
                    if (stack.isEmpty()) return false

                    val top = stack.pop()
                    when (top) {
                        '(' -> if (char != ')') return false
                        '{' -> if (char != '}') return false
                        '[' -> if (char != ']') return false
                    }
                }
            }
        }

        return stack.isEmpty()
    }
}