package arrays;

import java.util.*;

class DynamicArray{
	final int initialCapacity = 16;
	int arr[];
	int size;
	int capacity;
	
	DynamicArray(){
		size = 0;
		arr = new int[initialCapacity];
		capacity = initialCapacity; 
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
		System.out.println("List menu:");
		System.out.println("1. Insert at End\n");
		System.out.println("2. Display the list");
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
				list.insertAtPos(pos,value);
				break;
		case 4: System.out.println("Enter the position to delete (pos starts at 0)");
				pos = sc.nextInt();
				list.deleteAtPos(pos);
				break;
		case 5: System.exit(0);
		
		default: System.out.println("Invalid choice");
				
		}
	}
}
	
}
