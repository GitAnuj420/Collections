
import java.util.PriorityQueue;
import java.util.Scanner;
public class queues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
        pqueue.add(85);
        pqueue.add(65);
        pqueue.add(97);
        pqueue.add(36);
        pqueue.add(76); 
        pqueue.add(31);
        System.out.println(pqueue);
        System.out.println(pqueue.size());
        pqueue.peek();
        pqueue.poll();
        System.out.println(pqueue);
        pqueue.poll();
        System.out.println(pqueue);
        pqueue.poll();
        System.out.println(pqueue);
        

    }
}
