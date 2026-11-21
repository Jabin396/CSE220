
static void rangeReverse(Node dHead, int start, int end) {

    Node cur = dHead.next;
    Node prev = null;

    // Move to start index
    for (int i = 0; i < start; i++) {
        prev = cur;
        cur = cur.next;
    }

    Node before = prev;
    Node tail = cur;
    prev = null;

    // Reverse the range
    for (int i = start; i <= end && cur != null; i++) {
        Node next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
    }

    // Connect the reversed part
    tail.next = cur;

    if (before == null) {
        dHead.next = prev;
    }
    else {
        before.next = prev;
    }

    // Move remaining nodes before the reversed segment
    if (before != null) {
        Node temp = dHead;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = before;
        before.next = null;
    }
}
