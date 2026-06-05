
class LinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the linked list

    public LinkedList() {
        this.head = null;
    }

    // Get element at a specific index
    public int get(int index) {
        Node current = head;
        int count = 0;
        
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        return -1; // If index is out of range
    }

    // Insert at the head (beginning)
    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the tail (end)
    public void insertTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Remove element at a specific index
    public boolean remove(int index) {
        if (head == null) return false;

        if (index == 0) {
            head = head.next;
            return true;
        }

        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return false;
        }

        current.next = current.next.next;
        return true;
    }

    // Get all values in the linked list
    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        Node current = head;
        while (current != null) {
            values.add(current.data);
            current = current.next;
        }
        return values;
    }


}
