

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    // Lớp Mylinked chứa lớp Note
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    // Thêm đối tượng vào vị trí index trong danh sách
    // Tham số đầu vào: index, đối tượng thêm: data
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    //Thêm đối tượng vào vị trí đầu tiên trong danh sách
    //Tham số thêm vào data
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    // Thêm phương thức get để lấy phần tử vị trí thứ index của danh sách
    // them số truyền vào
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //Cài đặt phương thức printList
    //
    //Mục đích: Hiển thị danh sách các phần tử trong danh sách

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}