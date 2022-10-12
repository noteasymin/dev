package org.opentutorials.javatutorials.exception;

import java.io.*;

class B{
	void run() throws FileNotFoundException, IOException{
		BufferedReader br = null;
		String input = null;
		br = new BufferedReader(new FileReader("out.txt"));
		input = br.readLine();	
		System.out.println(input);
	}
}

class C{
	void run() throws FileNotFoundException, IOException{
		B b = new B();
			b.run();
	}
}
public class ThrowExceptionDemo {

	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 파일이 필요합니다.");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
