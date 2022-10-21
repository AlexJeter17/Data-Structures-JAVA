
public class LinkedListDriver {

	public static void main(String[] args) {
		
		LinkedListClass<Integer> list = new LinkedListClass<>();
		
		System.out.println(list.toString());
		list.add(0, 10); System.out.println(list.toString());
		list.add(0, 20); System.out.println(list.toString());
		list.add(0, 30); System.out.println(list.toString());
		list.add(1, 40); System.out.println(list.toString());
		list.add(2, 50); System.out.println(list.toString());
		list.remove(0); System.out.println(list.toString());
		list.remove(2); System.out.println(list.toString());
		
		System.out.println(list.get(1));
		list.set(1, 60);
		System.out.println(list.toString());
	}
	
	
}
