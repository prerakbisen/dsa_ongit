public class tnp_01 {
    int [] queue;
    int size;
    int front , rear;
    tnp_01(int size){
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }
    void enqueue(int element){
        if(rear==queue.length-1){
            System.out.println("queue full");
        }else {
            if (front == -1){
                front = 0;
            }
            rear++;
            queue[rear]=element;
        }
    }
    int dequeue(){
        if(front == -1){
            System.out.println("queue empty");
            return -1;
        }
        else {
            int element = queue[front];
            if (front == rear){
                front = rear = -1;
            }else {
                front ++;
            }
            return element;
        }
    }


    void circular_enqueue(int element){
        if((rear==queue.length-1 && front == 0 ) || (front == rear +1)){
            System.out.println("queue full");
        }  else {
            if (front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            queue[rear]=element;
        }
    }

    int circular_dequeue(){
        if(front == -1){
            System.out.println("queue empty");
            return -1;
        }
        else {
            int element = queue[front];
            if (front == rear){
                front = rear = -1;
            }else {
                front ++;
            }
            return element;
        }
    }

    void display(){
        for(int i = front; i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
    }

    public static void main(String[] args) {
        tnp_01 t = new tnp_01(3);
//        t.enqueue(5);
//        t.enqueue(56);
//        t.display();
//        t.dequeue();
        t.circular_enqueue(25);
        t.circular_enqueue(27);
        t.circular_enqueue(28);
        t.circular_enqueue(28);
        t.display();

    }
}
