import java.util.ArrayDeque;

public class dque {
        int [] queue;
        int size;
        int front , rear;
        dque(int size){
            this.size = size;
            queue = new int[size];
            front = rear = -1;
        }
        void insertfront(int element){
            if((rear==queue.length-1 && front == 0 ) || (front == rear +1)){
                System.out.println("queue full");
            }else {
                if (front == -1){
                    front = rear =0;
                } else if(front == 0){
                    front = size-1;
                }else{
                    front--;
                }
                queue[front]=element;
            }
        }
        void insertrear(int element){
            if((rear==queue.length-1 && front == 0 ) || (front == rear +1)){
                System.out.println("queue full");
            }else {
                if (front == -1){
                    front = rear =0;
                } else if (rear == size-1) {
                    rear = 0;
                }else {
                    rear ++;
                }
                queue[rear]=element;
            }
        }
        int deletefront(){
            if(front == -1){
                System.out.println("queue empty");
                return -1;
            }
            else {
                int element = queue[front];
                if (front == rear){
                    front = rear = -1;
                } else if (front == size-1) {
                    front = 0;
                } else {
                    front ++;
                }
                return element;
            }
        }


    int deleterear(){
        if(rear == -1){
            System.out.println("queue empty");
            return -1;
        }
        else {
            int element = queue[rear];
            if (front == rear){
                front = rear = -1;
            } else if (rear ==0) {
                rear = size-1;
            } else {
                rear --;
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
            dque t = new dque(3);
//        t.insertfront(5);
//        t.insertfront(56);
//        t.display();
//        t.insertrear();
//            t.circular_enqueue(25);
//            t.circular_enqueue(27);
//            t.circular_enqueue(28);
//            t.circular_enqueue(28);
//            t.display();
            ArrayDeque<String> a = new ArrayDeque<>();
            a.add("abc");
            a.add("abcd");
            a.add("abcde");
            a.poll();
            System.out.println(a);

        }


}
