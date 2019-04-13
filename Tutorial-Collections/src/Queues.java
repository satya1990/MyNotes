import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {

	public static void main(String[] args) {
		//Integer A[] = {3,1,2,9,5,0};
		Queue<Integer> q = new ArrayBlockingQueue<Integer>(5);
		q.add(3);
		q.add(10);
		q.add(1);
		q.add(5);
		
		System.out.println(q);		
		//head of the queue
		System.out.println("head: "+q.element());
		//remove FIFO
		//q.remove();
		//q.poll(); // retrieves and removes
		//q.peek(); //like stack top
		
		
		if(q.offer(40) == false)
			System.out.println(" failed to add element");
		System.out.println(q);
	}
}
