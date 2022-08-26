// https://leetcode.com/problems/palindrome-linked-list/solution/

function isPalindrome(head: ListNode | null): boolean {
  const dummyHead = new ListNode();
  dummyHead.next = head;

  // find the half
  let fastNode: ListNode | null = dummyHead;
  let slowNode: ListNode | null = dummyHead;

  while (fastNode.next !== null) {
    fastNode = fastNode!.next;
    slowNode = slowNode!.next;
    if (fastNode.next !== null) {
      fastNode = fastNode.next;
    }
  }

  // slowNode.next is in middile now, then reverse the middle to end
  let middleNode = slowNode!.next;
  const reverseHead = reverseList(middleNode);

  // check
  let result = true;
  let p1 = head;
  let p2 = reverseHead;

  while (p2 !== null) {
    if (p2.val !== p1!.val) {
      result = false;
      break;
    }
    p2 = p2.next;
    p1 = p1!.next;
  }

  // reverse back
  middleNode = reverseList(reverseHead);
  slowNode!.next = middleNode;

  return result;
}

function reverseList(head: ListNode | null) {
  let prev: ListNode | null = null;
  let curr = head;

  while (curr !== null) {
    const next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
  }

  return prev;
}
