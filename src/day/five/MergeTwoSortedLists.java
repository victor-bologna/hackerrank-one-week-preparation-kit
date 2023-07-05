package day.five;

class ResultOne {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(-1);
        SinglyLinkedListNode head = singlyLinkedListNode;

        while(head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                singlyLinkedListNode.next = head1;
                head1 = head1.next;
            } else {
                singlyLinkedListNode.next = head2;
                head2 = head2.next;
            }
            singlyLinkedListNode = singlyLinkedListNode.next;
        }

        if(head1 != null) {
            singlyLinkedListNode.next = head1;
        } else {
            singlyLinkedListNode.next = head2;
        }
        return head.next;
    }
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ResultOne.SinglyLinkedList singlyLinkedList1  = new ResultOne.SinglyLinkedList();
        ResultOne.SinglyLinkedList singlyLinkedList2  = new ResultOne.SinglyLinkedList();

        singlyLinkedList1.insertNode(1);
        singlyLinkedList1.insertNode(2);
        singlyLinkedList1.insertNode(3);
        singlyLinkedList2.insertNode(1);
        singlyLinkedList2.insertNode(2);
        singlyLinkedList2.insertNode(7);
        singlyLinkedList2.insertNode(8);
        singlyLinkedList2.insertNode(9);

        ResultOne.SinglyLinkedListNode singlyLinkedListNode = ResultOne.mergeLists(singlyLinkedList1.head, singlyLinkedList2.head);

        while (singlyLinkedListNode != null) {
            System.out.println(singlyLinkedListNode.data);
            singlyLinkedListNode = singlyLinkedListNode.next;
        }
    }
}
