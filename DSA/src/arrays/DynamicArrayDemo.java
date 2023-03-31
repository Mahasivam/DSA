package arrays;

import java.util.*;

class DynamicArray{
	static final int initialCapacity = 16;
	private int arr[];
	private int size;
	private int capacity;
	
	DynamicArray(){
		size = 0;
		arr = new int[initialCapacity];
		capacity = initialCapacity; 
	}
	
	public void add(int value){
		if(size==capacity) {
			expandArray();
		}
		arr[size] = value;
		size++;
	}
	
	public void expandArray() {
		capacity = capacity * 2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}
	
	public void display() {
		System.out.println("Elements in the array:");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

public class DynamicArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		int pos;
		
		DynamicArray list = new DynamicArray();
		
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
		System.out.println("List menu:\n ");
		System.out.println("1. Insert at End\n");
		System.out.println("2. Display the list\n");
		System.out.println("3. Insert at specified position\n");
		System.out.println("4. Delete from specified position\n");
		System.out.println("5. Exit\n");
		System.out.println();
		
		System.out.println("Enter your choice: ");
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1: System.out.print("Enter the data");
				value = sc.nextInt();
				list.add(value);
				break;
		case 2: list.display();
				break;
		case 3: System.out.print("Enter the position to insert (pos starts at 0)");
				pos = sc.nextInt();
				if(pos<0) {
					System.out.println("Invalid position");
				}
				System.out.print("Enter the data:");
				value = sc.nextInt();
//				list.insertAtPos(pos,value);
				break;
		case 4: System.out.println("Enter the position to delete (pos starts at 0)");
				pos = sc.nextInt();
//				list.deleteAtPos(pos);
				break;
		case 5: System.exit(0);
		
		default: System.out.println("Invalid choice");
				
		}
	}
}
	
}
