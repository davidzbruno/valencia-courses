import java.util.PriorityQueue;

public class QueueDemo{


    public static void main(String[] args) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for(int i =10; i>0;i--){
            queue.add(i);
        }

        queue.add(12);
        queue.add(1000);

        // Queue: (front) 10 9 8 7 6 5 4 3 2 1 (rear)
        // PriorityQueye sorts the Data for us
        // Queue: (front) 1 2 3 4 5 6 7 8 9 10 (rear) | Sorted Queue the actual one


        // Peeking -> Obtating the head of the queue
        // Polling -> Removing the head of the queue

        System.out.println("Queue Size is: "+queue.size());
        System.out.println("Head of Queue is: "+queue.peek()); // Head of Queue: 1
        
        queue.poll(); // Removing the head (1)
        System.out.println("Queue Size After Poll is: " + queue.size());
        System.out.println("Head of Queue is: " +queue.peek()); //New Head of Queue
    }
}