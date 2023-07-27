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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var current = head
        var prev: ListNode? = null
        var newHead: ListNode? = head

        while (current != null) {
            if (current.`val` == `val`) {
               
                if(prev == null) {
                    // 삭제하려는 노드가 헤드 노드인 경우
                    newHead = current.next
                } else {
                    // 삭제하려는 노드가 헤드 노드가 아닌 경우
                    prev.next = current.next
                }  
            } else {
                // 이전 노드를 업데이트하여 다음 노드로 이동
                prev = current
            }

            // 현재 노드를 다음 노드로 이동
            current = current.next
        }

        // 수정된 헤드 노드를 반환
        return newHead
    }
}