function mergeTwoLists(
  list1: ListNode | null,
  list2: ListNode | null
): ListNode | null {
  let curr1 = list1;
  let curr2 = list2;

  const dummyHeader = new ListNode();
  let curr = dummyHeader;
  while (curr1 !== null && curr2 !== null) {
    if (curr1.val < curr2.val) {
      curr.next = curr1;
      curr1 = curr1.next;
    } else {
      curr.next = curr2;
      curr2 = curr2.next;
    }

    curr = curr.next;
  }

  while (curr1 !== null) {
    curr.next = curr1;
    curr1 = curr1.next;
    curr = curr.next;
  }

  while (curr2 !== null) {
    curr.next = curr2;
    curr2 = curr2.next;
    curr = curr.next;
  }

  return dummyHeader.next;
}
