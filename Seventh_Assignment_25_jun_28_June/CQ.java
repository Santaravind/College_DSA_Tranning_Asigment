package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.*;

public class CQ {
    ArrayList<Integer>queue;
    int front,rear, size,capcity;
    CQ(int capcity){
        this.capcity=capcity;
        queue=new ArrayList<>();
        for(int i=0; i<capcity; i++){
            queue.add(0);
        }
        front=-1;
        rear=-1;
        size=0;
//        System.out.println(q);
    }

    void add(int data){

        if (size==capcity){
            System.out.println("Queue is full !");
            return;
        }
        if (front==-1&&rear==-1){
            front++;
            rear++;
            queue.set(rear,data);
        }else {
            rear=(rear+1)%capcity;
            queue.set(rear,data);
//            System.out.println(queue.removeLast());
        }
        size++;
    }

    int dequeue(){

//        if (front==-1&&rear==-1||front==rear){
//            System.out.println("Queue is Empty ");
//            return 0 ;
//        }
        if (size==0){
            System.out.println("Queue is empty ");
            return -1;
        }
        int d=queue.get(front);
        front=(front+1)%capcity;
        size--;

        return d;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
//          if (size==0||size==capcity){
//              System.out.println("String is empty");
//              return String.valueOf(sb);
//          }

        sb.append("[");
        if (size!=0) {
            int n = front;
            while (true) {
                sb.append(queue.get(n));
                if (n != rear) sb.append(",");
                if (n == rear) {
                    break;
                }
                n = (n + 1) % capcity;
            }
        }
        sb.append("]");
        return String.valueOf(sb);
    }

//

    public static void main(String[] args) {
        CQ queue=new CQ(3);
        queue.add(10);
        System.out.println(queue);
        queue.add(20);
        System.out.println(queue);
        queue.add(30);
        System.out.println(queue);
        queue.add(40);
        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.add(90);
        queue.add(70);
        queue.add(80);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.add(20);
        queue.add(800);
        queue.add(70);
        System.out.println(queue);

        HashMap<Character,Integer>map=new HashMap<>();
        map.put('a',3);
        map.put('b',1);
        map.put('c',2);
       ArrayList<Map.Entry<Character,Integer>>list=new ArrayList<>(map.entrySet());
//       list.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));

        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));

        System.out.println(list);
    }
}
