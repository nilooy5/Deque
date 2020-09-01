public class Controller {

    public static void main(String[] args) {

        Deque deque = new Deque();
        deque.pushLeft(18);
        deque.pushRight(45);
        deque.pushLeft(12);
        deque.pushRight(25);

        deque.show();

        deque.pushLeft(960);
        deque.pushRight(420);

        deque.show();

        deque.printSize();
        deque.popLeft();

        deque.show();

        deque.popRight();

        deque.show();
        deque.printSize();
    }
}
