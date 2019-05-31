class CircularQueue {

    private int currentSize;
    public int[] arr;
    private int rear , front;


    public CircularQueue() {
      currentSize = 0;
      arr = new int[3];
      rear = 0;
      front = 0;
    }

    /**
     * To add an element to the queue
     * @param value
     * @return
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        } else {
            arr[rear] = value;
            rear = (rear + 1) % arr.length;
            currentSize++;
            return true;
        }
    }

    /**
     * To delete an element from the queue
     * @return
     */
    public boolean deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return false;
        } else {
            arr[front] = 0;
            front = (front + 1) % arr.length;
            currentSize--;
            return true;
        }
    }

    /**
     * To get the front element from the queue
     * @return
     */
    public int Front() {
        if (isEmpty()) return -1;
        else {
            System.out.println("Front element "+arr[front]);
            return arr[front];
        }
    }

    /**
     * To get the rear element from the queue
     * @return
     */
    public int Rear() {
        if(isEmpty()) return -1;
        else {
            System.out.println("Rear element "+ arr[(rear + arr.length - 1) % arr.length]);
            return arr[(rear + arr.length - 1) % arr.length];
        }
    }

    /**
     * To check whether queue is full
     * @return
     */
    public boolean isFull() {

        return currentSize == arr.length;
    }

    /**
     * To check whether queue is empty
     * @return
     */
    public boolean isEmpty() {
        return currentSize == 0;
    }

    /**
     * To diaplay all elements in †he queue
     */
    public void display() {
        for (int e : arr) {
            System.out.println("Circular Queue " + e);
        }
    }


}


public class Main {

    public static void main(String[] args) {

        CircularQueue circularQueue = new CircularQueue();
        circularQueue.enQueue(6);
        circularQueue.Rear();
        circularQueue.Rear();
        circularQueue.deQueue();
        circularQueue.enQueue(5);
        circularQueue.Rear();
        circularQueue.deQueue();
        circularQueue.Front();
        circularQueue.deQueue();
        circularQueue.deQueue();
        circularQueue.deQueue();
    }
}


