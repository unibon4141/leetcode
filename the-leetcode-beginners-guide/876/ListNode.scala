class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

// object Solution876 {
//   def middleNode(head: ListNode): ListNode = {
//     var headFirstCopy = head
//     var headCopy = head
//     var nodeCnt = 1
//     val a = while (headFirstCopy.next != null) {
//       nodeCnt += 1
//       headFirstCopy = headFirstCopy.next
//     }
//     for (i <- 1 to nodeCnt / 2) {
//       headCopy = headCopy.next
//     }
//     headCopy

//   }
// }

object Solution876 {
  def middleNode(head: ListNode): ListNode = {
    @annotation.tailrec
    def getNodes(node: ListNode, acc: List[ListNode] = Nil): List[ListNode] = {
      if (node == null) acc.reverse
      else getNodes(node.next, node :: acc)
    }

    val nodes = getNodes(head)
    nodes(nodes.length / 2)
  }
}

/** Definition for singly-linked list. class ListNode(_x: Int = 0, _next: ListNode = null) { var next: ListNode = _next
  * var x: Int = _x }
  */
