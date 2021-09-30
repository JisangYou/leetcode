class MyLinkedList() {
   private val linkedList = LinkedList<Int>()

    fun get(index: Int): Int {

        if (linkedList.size > index) {
            return linkedList[index]
        } else {
            return -1
        }
    }

    fun addAtHead(`val`: Int) {
        linkedList.addFirst(`val`)

    }

    fun addAtTail(`val`: Int) {
        linkedList.addLast(`val`)
    }

    fun addAtIndex(index: Int, `val`: Int) {
        linkedList.add(index, `val`)
    }

    fun deleteAtIndex(index: Int) {
        if (linkedList.size > index) {
            linkedList.removeAt(index)
        }
    }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(`val`)
 * obj.addAtTail(`val`)
 * obj.addAtIndex(index,`val`)
 * obj.deleteAtIndex(index)
 */