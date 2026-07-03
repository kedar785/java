package Queues;

public class designcircularQueue {
    int[] queue;
        int front;
        int rear;

        int size;
        int capacity;
        public designcircularQueue(int k) {
            queue=new int[k];
            capacity=k;
            front =0;
            rear=-1;
            size =0;
        }

        public boolean enQueue(int value) {
            if(size==capacity)
                return false;
            rear=(rear+1)%capacity;
            queue[rear]=value;
            size++;
            return true;
        }

        public boolean deQueue() {
            if(size==0)
                return false;
            front=(front+1)%capacity;
            size--;
            return true;
        }

        public int Front() {
            if(size==0)
                return -1;
            return queue[front];

        }


        public int Rear() {
            if(size==0)
                return -1;
            return queue[rear];
        }

        public boolean isEmpty() {
            return size==0;
        }

        public boolean isFull() {
            return size==capacity;
        }
    }



