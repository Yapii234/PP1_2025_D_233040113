package Pertemuan2;

public class ListTest {
	public static void main(String[]args) {
		StrukturList list = new StrukturList();
		list.addTail(3);
		list.addTail(4);
		list.addTail(5);
		
		System.out.println("Elemen: ");
		list.displayElment();
		
		StrukturList list1 = new StrukturList();
		list1.addTail(3);
		list1.addTail(2);
		list1.addTail(1);
		
		System.out.println("Elemen: ");
		list1.displayElment();
		
		StrukturList list2 = new StrukturList();
		list2.addTail(1);
		list2.addTail(4);
		list2.addTail(5);
		list2.addTail(7);
		
		System.out.println("Elemen: ");
		list2.displayElment();
		
		StrukturList list3 = new StrukturList();
		list3.addHead(5);
		list3.addHead(4);
		list3.addHead(3);
		
		System.out.println("Elemen: ");
		list3.displayElment();
		
		StrukturList list4 = new StrukturList();
		list4.addHead(1);
		list4.addHead(2);
		list4.addHead(3);
		
		System.out.println("Elemen: ");
		list4.displayElment();
		
		StrukturList list5 = new StrukturList();
		list5.addHead(7);
		list5.addHead(5);
		list5.addHead(4);
		list5.addHead(1);
		
		System.out.println("Elemen: ");
		list5.displayElment();
	}

}
