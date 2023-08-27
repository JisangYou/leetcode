/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    val result = mutableListOf<Int>()
    fun preorder(root: Node?): List<Int> {
        if(root == null) return result
        result.add(root.`val`)
        for (child in root.children) {
            preorder(child)
        }
        return result
    }
}