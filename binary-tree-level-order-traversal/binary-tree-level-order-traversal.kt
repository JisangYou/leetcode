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
class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val ans: MutableList<List<Int>> = ArrayList()
    val q: Queue<TreeNode> = LinkedList()
    var subAns: MutableList<Int>
    if (root != null) {
        q.offer(root)
    }
    var cur: TreeNode
    while (q.isNotEmpty()) {
        subAns = LinkedList()
        
        for (i in 0 until q.size) {        // traverse nodes in the same level
            cur = q.poll()
            subAns.add(cur.`val`!!) // visit the root
            if (cur.left != null) {
                q.offer(cur.left) // push left child to queue if it is not null
            }
            if (cur.right != null) {
                q.offer(cur.right) // push right child to queue if it is not null
            }
        }
        ans.add(subAns)
    }
    return ans
    }
}