package org.opentutorials.javatutorials.abstractclass.example3;

class Calculator{
	int first, second;
	public void setOprands(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	public void run() {
		System.out.println(first + second);
	}
}

class CalculatorDecoPlus extends Calculator{
	public void run() {
		System.out.println("+++"); 
	}
}

class CalculatorDecoMinus extends Calculator{	
	public void run() {
		System.out.println("---");
	}
}


public class CalculatorDemo {
	public static void excute(Calculator cal) {
		System.out.println("실행결과");
		cal.run();
	}
	
	public static void main(String[] args) {
		Calculator c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();
		
		Calculator c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
		
		excute(c1);
		excute(c2);
		
	}

}
