package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {

		System.out.println("switch(1)");
		
		switch(1) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
			default:
				System.out.println("default");
		}
		
		switch(2) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		switch(3) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		int val = 1;
		if(val==1) {
			System.out.println("one");
		}
		
		else if(val==2)
		{
			System.out.println("two");
		} else if(val==3) {
			System.out.println("three");
		}
		
		

	}

}
