package ust;

public class Deque {
    Node front;
    Node rear;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public void enqueueFront(int d) {
        Node newnode = new Node(d);
        if (front == null) {
            front = newnode;
            rear = newnode;
        } else {
            newnode.next = front;
            front.prev = newnode;
            front = newnode;
        }
    }

    public void enqueueRear(int d) {
        Node newnode = new Node(d);
        if (rear == null) {
            front = newnode;
            rear = newnode;
        } else {
            rear.next = newnode;
            newnode.prev = rear;
            rear = newnode;
        }
    }

    public void dequeueFront() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
    }

    public void dequeueRear() {
        if (rear == null) {
            System.out.println("Queue is empty");
            return;
        }
        rear = rear.prev;
        if (rear == null) {
            front = null;
        } else {
            rear.next = null;
        }
    }

    public void peekFront() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(front.data);
    }

    public void peekRear() {
        if (rear == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(rear.data);
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Deque q = new Deque();
        q.enqueueFront(5);
        q.enqueueFront(4);
        q.enqueueRear(6);
        q.enqueueRear(7);
        System.out.println("Display");
        q.display();
        System.out.println("\nPeek Front:");
        q.peekFront();
        System.out.println("Peek Rear:");
        q.peekRear();
        System.out.println("Dequeuing from front:");
        q.dequeueFront();
        System.out.println("Dequeuing from rear:");
        q.dequeueRear();
        System.out.println("Display");
        q.display();
    }
}
