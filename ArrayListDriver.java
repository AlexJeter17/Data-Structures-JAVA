public class ArrayListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListClass<Integer> list = new ArrayListClass<>();
        
        list.add(10);
        System.out.println(list);
        list.add(20);
        System.out.println(list);
        list.add(30);
        System.out.println(list);
		list.add(100, 0);
		System.out.println(list);
		list.remove(16);
		System.out.println(list);
		
		Integer value = list.get(0);
		System.out.println("The value and location 0 is: " + value);
		System.out.println(list);
		
		list.set(99, 0);
		System.out.println(list);
		int i = list.indexOf(30);
		System.out.println(i);
	}

}