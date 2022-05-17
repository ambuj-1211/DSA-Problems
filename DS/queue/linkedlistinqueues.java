// import java.util.*;
class Qnode {
    int data;
    Qnode next;

    public Qnode(int key) {
        this.data = key;
        this.next = null;
    }
}

class queue {
    Qnode front, rear;

    public queue() {
        this.front = this.rear = null;
    }

    void enqueue(int k) {
        Qnode temp = new Qnode(k);
        if (this.rear == null) {
            this.rear = this.front = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;//why is this done ->reason unfind
    }

    void dequeue() {
        if (this.front == null) {
            return;
        }
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
    }


}

public class linkedlistinqueues {
    public static void main(String[] args) {
        queue q= new queue();
        q.enqueue(51);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(8);
        q.dequeue();
        q.dequeue();
        q.enqueue(78);
        q.enqueue(65);
        q.dequeue();
        // System.out.println("front element is : "+q.front.data);
        // System.out.println("rear element is : "+q.rear.data);
        // System.out.println("queue elements are :- ");
        
        Qnode temp= q.front;
        System.out.println("Front ->"+temp.data);
        temp=temp.next;
        while(temp.next!=null){
            System.out.println("        "+temp.data);
            temp=temp.next;
        }
        System.out.println("Rear  ->"+temp.data);
        
    }
}
