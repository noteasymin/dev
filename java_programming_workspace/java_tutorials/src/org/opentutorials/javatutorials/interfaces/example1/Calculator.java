package org.opentutorials.javatutorials.interfaces.example1;

class Calculator implements Calculatortable{
	int left, right,third ;
	public void setOprands(int left, int right, int third) {
		this.left = left;
		this.right = right;
		this.third = third;
	}
	
	public int sum() {
		return (this.left + this.right + this.third);
	}
	
	public int avg() {
		return ((this.left + this.right + this.third)/3);
	}
}