package org.opentutorials.javatutorials.generic;

class StudentInfo{
	public int grade;
	StudentInfo (int grade){
		this.grade = grade;
	}
}

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){ this.rank = rank;}
	}

class Person{
	public Object info;
	Person(Object info){this.info = info;}
}

public class GenericDemo {

	public static void main(String[] args) {
		Person p1 = new Person("����");
		EmployeeInfo ei = (EmployeeInfo)p1.info; //Ÿ���� �������� �ʴ�
		System.out.println(ei.rank);

	}

}
