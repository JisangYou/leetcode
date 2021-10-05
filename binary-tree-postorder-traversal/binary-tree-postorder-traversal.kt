/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
import java.util.*

class Solution {
    // iterative
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val stack: Stack<TreeNode?> = Stack()
        val result: ArrayList<Int> = arrayListOf()
        if (root?.`val` == null) {
            return result
        }
        stack.push(root)

        val out: Stack<Int> = Stack()

        while (!stack.empty()) {
            val curr: TreeNode? = stack.pop()
            out.push(curr?.`val`)

            if (curr?.left != null) {
                stack.push(curr.left)
            }
            if (curr?.right != null) {
                stack.push(curr.right)
            }
        }


        while (!out.empty()) {
            result.add(out.pop())
        }

        return result
    }
}