
public class ArrayQueueDriver {

	public static void main(String args[]) {
		
		ArrayQueueClass<Integer> Q = new ArrayQueueClass<>();
		Q.offer(10); System.out.println(Q);
		Q.offer(20); System.out.println(Q);
		Q.offer(30); System.out.println(Q);
		Q.offer(40); System.out.println(Q);
		Q.offer(50); System.out.println(Q);
		Q.offer(60); System.out.println(Q);
		Q.offer(70); System.out.println(Q);
		
		Q.poll(); System.out.println(Q);
		Q.poll(); System.out.println(Q);

		Q.offer(80); System.out.println(Q);
		Q.offer(90); System.out.println(Q);

		Q.poll(); System.out.println(Q);
		Q.poll(); System.out.println(Q);
		Q.poll(); System.out.println(Q);
		Q.poll(); System.out.println(Q);
		Q.poll(); System.out.println(Q);
		Q.poll(); System.out.println(Q);
		Q.poll(); System.out.println(Q);
		Q.poll(); System.out.println(Q);
		
		Q.offer(60); System.out.println(Q);
		Q.offer(70); System.out.println(Q);
		
		System.out.println(Q.peek());
	}
	
}
