/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
     fun reverseList(head: ListNode?): ListNode? {
        var currentNode = head
        var newNode: ListNode? = null 
        while(currentNode != null) {
            var nextNode = currentNode.next
            currentNode.next = newNode
            newNode = currentNode
            currentNode = nextNode
        }
        return newNode
    }
}