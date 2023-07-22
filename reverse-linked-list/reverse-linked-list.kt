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
        var prevNode: ListNode? = null // 이전 노드를 가리키는 포인터
        var currentNode = head // 현재 처리 중인 노드를 가리키는 포인터

        while (currentNode != null) { // 연결 리스트를 끝까지 순회합니다.
            val nextNode = currentNode.next // 다음 노드를 임시로 저장합니다.
            currentNode.next = prevNode // 현재 노드의 다음 노드를 이전 노드로 변경하여 뒤집습니다.
            prevNode = currentNode // 이전 노드를 현재 노드로 업데이트합니다.
            currentNode = nextNode // 다음 노드를 현재 노드로 업데이트하여 순회를 계속합니다.
        }

        return prevNode // 뒤집힌 연결 리스트의 첫 번째 노드인 prevNode를 반환합니다.
    }
}