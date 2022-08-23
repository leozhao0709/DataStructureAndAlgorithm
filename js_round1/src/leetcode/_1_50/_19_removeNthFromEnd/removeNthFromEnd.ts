// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

// class ListNode {
//   val: number;
//   next: ListNode | null;
//   constructor(val?: number, next?: ListNode | null) {
//     this.val = val === undefined ? 0 : val;
//     this.next = next === undefined ? null : next;
//   }
// }

// function removeNthFromEnd(head: ListNode | null, n: number): ListNode | null {
//   const dummyHeader = new ListNode();
//   dummyHeader.next = head;
//   let length = 0;
//   let node: ListNode | null = dummyHeader;
//   while (node?.next !== null) {
//     length++;
//     node = node.next;
//   }

//   node = dummyHeader;
//   let i = 0;
//   while (i < length - n) {
//     i++;
//     node = node!.next;
//   }

//   node!.next = node!.next ? node!.next.next : null;
//   return dummyHeader.next;
// }

function removeNthFromEnd(head: ListNode | null, n: number): ListNode | null {
  const dummyHeader = new ListNode();
  dummyHeader.next = head;

  let fastNode = head;
  let slowNode = head;
  let i = 0;
  while (i < n) {
    fastNode = fastNode!.next;
    i++;
  }

  if (fastNode === null) {
    dummyHeader.next = head?.next ?? null;
    return dummyHeader.next;
  }

  while (fastNode!.next !== null) {
    fastNode = fastNode!.next;
    slowNode = slowNode!.next!;
  }

  slowNode!.next = slowNode!.next!.next;

  return dummyHeader.next;
}
