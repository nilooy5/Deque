public class Deque {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head==null) {
            head = node;
        }
        else {
            Node n = head;
            while(n.next!=null) {
                n = n.next;
            }
            n.next =  node;
        }
    }
    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index,int data) {
        Node node = new Node();
        node.data = data;
        System.out.println("Inserting: " + node.data);
        node.next = null;

        if(index==0) {
            insertAtStart(data);
        }
        else {
            Node n = head;
            for(int i = 0; i < index-1 ; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index) {
        if(index==0) {
            head = head.next;
        }
        else {
            Node n = head;
            Node n1 = null;
            for(int i=0;i<index-1;i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            //System.out.println("n1 " + n1.data);
            n1 = null;
        }
    }

    public void show() {
        Node node = head;

        System.out.println("Current Staque:");

        while(node.next!=null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data);

        System.out.println();
    }

    public void push(int data) {
        insertAtStart(data);
    }

    public void pop() {
        System.out.println(head.data + " popped");
        head = head.next;
    }

    public int size() {
        Node node = head;
        int count = 0;
        while(node.next!=null) {
//            System.out.println(node.data);
            node = node.next;
            count++;
        }
        return count+1;
    }

    public void enqueue(int data) {
        Node node = head;
        int count = 0;
        while(node.next!=null) {
//            System.out.println(node.data);
            node = node.next;
            count++;
        }
        System.out.println("Enqueuing: " + data);
        insertAt(count + 1, data);
    }

    public void pushLeft(int data) {
        insertAtStart(data);
    }

    public void pushRight(int data) {
        enqueue(data);
    }
}
