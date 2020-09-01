public class Controller {

    public static void main(String[] args) {

        Deque deque = new Deque();
        deque.insert(18);
        deque.insert(45);
        deque.insert(12);
        deque.insertAtStart(25);

        // deque.insertAt(0, 55);

        // deque.deleteAt(2);
        deque.enqueue(999);

        deque.show();
        deque.pop();

        deque.show();
        System.out.println("Size of Deque: " + deque.size());
        deque.popLeft();

        deque.show();
        deque.popRight();

        deque.show();
    }
}
