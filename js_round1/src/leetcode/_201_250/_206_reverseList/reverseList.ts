// https://leetcode.com/problems/reverse-linked-list/

function reverseList(head: ListNode | null): ListNode | null {
  let prevNode: ListNode | null = null;
  let currNode = head;
  while (currNode !== null) {
    const nextNode = currNode.next;
    currNode.next = prevNode;
    prevNode = currNode;
    currNode = nextNode;
  }

  return prevNode;
}
