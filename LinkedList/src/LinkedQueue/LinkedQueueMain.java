package LinkedQueue;
/**
 *
 * @author zs087
 */
public class LinkedQueueMain {
    public static void main(String [] args)
    {
    LinkedQueue queue = new LinkedQueue();
    
    //Is the queue empty to start yes 
    System.out.println("Is the queue empty currently? " + queue.isEmpty());
    
    //add to queue
    System.out.println("Enqueue here");
    queue.enqueue(75);
    queue.enqueue(43);
    queue.enqueue(23);
    
    //write out the queue
    System.out.println(queue.toString() + "\n");
    
    //dequeue the queue
    queue.dequeue();
    
    //write to the queue again for testing
    System.out.println("After the Dequeue");
    System.out.println(queue.toString() + "\n");
    
    //add to the queue
    System.out.println("Enqueue here");
    queue.enqueue(83);
    queue.enqueue(24);
    
    //write out the queue
    System.out.println(queue.toString() + "\n");
    
    //dequeue the queue
    queue.dequeue();
    
    //write the queue out again
    System.out.println(queue.toString() + "\n");
    
    //add to the queue
    System.out.println("Enqueue here");
    queue.enqueue(13);
    queue.enqueue(2);
    queue.enqueue(193);

    //dequeue the queue one last time
    System.out.println("Before the last Dequeue");
    queue.dequeue();
    
    //true / false on if it is empty
    System.out.println("Is the queue empty currently? " + queue.isEmpty());
    
    //peek to get the front node in list
    System.out.println("What does the peek method show us? " + queue.peek());
    System.out.println("proof of the peek method working above next line is current queue");
    
    //write the queue out again
    System.out.println(queue.toString() + "\n");
   
    }
}
