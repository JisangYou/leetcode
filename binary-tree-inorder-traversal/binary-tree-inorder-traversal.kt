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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root?.left != null) inorderTraversal(root.left)
        if (root?.`val` != null) {
            array.add(root.`val`!!)
        }
        if (root?.right != null) inorderTraversal(root.right)
        return array
    }
}