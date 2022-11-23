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
    var array: ArrayList<Int> = arrayListOf()
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if (root?.`val` != null) {
            array.add(root.`val`!!)
        }
        if (root?.left != null) preorderTraversal(root.left)
        if (root?.right != null) preorderTraversal(root.right)
        return array
    }
}