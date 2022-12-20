import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
    private Queue<Request> queue;
    private int maxSize;  // maximum size of the queue

    public RequestQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new LinkedList<>();
    }

    // method to add a request to the queue
    public void enqueue(Request request) {
        if (queue.size() == maxSize) {
            throw new IllegalStateException("Cannot add to a full queue");
        }
        queue.add(request);
    }

    // method to remove a request from the queue
    public Request dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Cannot remove from an empty queue");
        }
        return queue.remove();
    }

    // method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

// class representing a request
class Request {
    // add necessary fields and methods here
}
