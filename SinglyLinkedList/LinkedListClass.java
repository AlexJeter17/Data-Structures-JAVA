
public class LinkedListClass<E> implements LinkedListInterface<E>{

	
	
	// create a private node class
	private class Node<F>{
		private F data;			// data in the node
		private Node<F> next; 	// points to the next linked list
	
		// Constructors
		// This will create a node with the data and next value
		
		private Node(F data, Node<F> next){
			this.data = data;
			this.next = next;
		}
		//base constructor with only data
		private Node(F data) {
			this(data,null); // This calls the other constructor to create the node.
		}
		
	}
	
	// Data and methods for Linked List
	
	private Node<E> head;		//Reference to the Head of Linked List
	private int size;			// this just gets the size of Linked list
	
	//Constructor for Linked List
	
	
	public LinkedListClass() { // creates linked list with no other nodes
		
		this.head = new Node<E>(null);
		this.size = 0;
	}
	
//	public LinkedListClass(E data, int index) {
//		
//		
//		
//	}
	
	
	@Override
	public void add(int index, E item) { // adds element to LL at specific index
		
		if(index < 0 || index > this.size) {
			System.out.println("Invalid Index");
			return;
		}
		else if(index == 0) {
			addfirst(item);
		}
		else {
			// add after some node
			// need the reference of the node first
			
			Node<E> node = getNode(index); // get the reference of prev node
			addAfter(node,item);
			
		}
	}

	private void addAfter(Node<E> node, E item) {
		// Add new item after the reference
		
		node.next = new Node<E>(item, node.next);
		size++;
		
		
	}

	private Node<E> getNode(int index) {
	// This method loops through the LL to get a Specific node at the given index
		
		if(index < 0 || index > this.size) {
			System.out.println("Invalid Index");
			return null;
		}
		
		Node<E> node = head;
		for(int i = 0; i < index && node != null; i++) {
			node = node.next;
		}
		
		
	return node; // return the reference
}

	private void addfirst(E item) {

		// We create a node with item as data. and head.next as the next 
		// then update the head.,next to point to this node
		// Lastly, we up the size
		
		Node<E> temp = new Node<E>(item, head.next);
		head.next = temp;
		// combine the next two lines with this line
//		head.next = new Node<E>(item,head.next);
		
		size++;
	}

	@Override
	public E remove(int index) {
		// this method removes a node from the LL at given index
		//check if index is valid
		
		if(index < 0 || index > this.size) {
			System.out.println("Invalid Index");
			return null;
		}
		else if(index == 0){
			return removeFirst();
		}
		else {
			Node<E> node = getNode(index);
			return removeAfter(node);
		}
		
	}

	private E removeAfter(Node<E> node) {
		
		Node<E> temp = node.next;
		if(temp != null) {
			node.next = temp.next;
			size--;
			return temp.data;
		}
		
		return null;
	}

	private E removeFirst() {
		// Delete the first node
		
		Node<E> temp = head;
		if(temp != null) {
			head = head.next;
			size--;
			return temp.data;
		}
		
		return null;
	}

	@Override
	public E get(int index) {
		
		Node<E> temp = head;
		
		for(int i = 0; i < index && temp.next != null; i++) {
			
			temp = temp.next;
			
		}
		
		return temp.data;
	}

	@Override
	public E set(int index, E newItem) {
		
		Node<E> temp = head;
		
		for(int i = 0; i < index && temp.next != null; i++) {
			
			temp = temp.next;
			
		}
		
		temp.data = newItem;
		
		return newItem;
	}

	@Override
	public int size() {
		return this.size;
	}

	
	public String toString() {
		
		String s = "[";
		
		Node<E> p = head; // this references the head of the linked list.
		
		if(p != null) { // Wheren there is no head, check the error
			while(p.next != null) {
				// iterate over the nodes one by one
				
				s+= p.next.data + " -> "; // adds data to string
				p = p.next; // goes to next LL
			}
		}
		
		s+= "]";
		
		return s;
	}
	
}
