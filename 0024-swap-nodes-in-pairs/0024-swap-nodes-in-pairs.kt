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
fun swapPairs(head: ListNode?): ListNode? {
    if (head?.next == null) return head
    val second = head.next
    val third = second?.next

    second.next = head
    head.next = swapPairs(third)

    return second
    }
}