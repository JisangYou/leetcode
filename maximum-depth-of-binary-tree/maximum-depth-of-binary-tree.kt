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
import kotlin.math.max

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) {
            return 0
        }
        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)
        return max(leftDepth, rightDepth) + 1
    }
}