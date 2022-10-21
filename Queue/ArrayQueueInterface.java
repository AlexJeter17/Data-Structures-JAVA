
public interface ArrayQueueInterface<E> {

	public void offer(E obj);
	public E poll();
	public boolean isEmpty();
	public boolean isFull();
	public E peek();
	
}
