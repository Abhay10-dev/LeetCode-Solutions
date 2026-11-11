class MyCircularQueue {
    private static int[] queue;
    private int head;   
    private int tail;   
    private int capacity;   

    public MyCircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.head = -1;
        this.tail = -1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;

        if(isEmpty()){
            head = 0;
        }

        tail = (tail + 1) % capacity;
        queue[tail] = value;

        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) {
            return false;  
        }
        
        if(head == tail){
            head = -1;
            tail = -1;
        } else {
            head = (head + 1) % capacity;
        }

        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : queue[head];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : queue[tail];
    }
    
    public boolean isEmpty() {
        return head == -1;
    }
    
    public boolean isFull() {
        return (tail + 1) % capacity == head;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */