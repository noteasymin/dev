package org.opentutorials.javatutorials.constant2;

/*class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
	
}*/
enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor() {
		return this.color;
	}
	Fruit(String color) {
		System.out.println("Call Constructor " + this);
		this.color = color;
	}
}
/*class Company{
	public static final Company GOOGLE = new Company();
	public static final Company APPLE = new Company();
	public static final Company ORACLE = new Company();
}*/
enum Company{
	GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo {
	
	
	public static void main(String[] args) {
		
		
		Fruit type = Fruit.APPLE;
		switch(type) {
		case APPLE:
			System.out.println(57+" kcal , color " +Fruit.APPLE.getColor());
			break;
		}
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f);
		}
	}

} 
