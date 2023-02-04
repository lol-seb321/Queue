import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

class Main {
  public static void main(String[] args) {
    Queue<Double> queue = new PriorityQueue<>();
    queue.add(3.0);
    queue.add(1.5);
    queue.add(2.5);
    queue.add(4.0);

    while(!queue.isEmpty()){
      System.out.println(queue.poll());
    }
  }
}