public class Demo
{
	public static void main(String[] args) {
		Dog dog = new Dog();
		 // dog.move(); //this is a bachha wala practice
		Animal.Nature reference;
		reference = dog;
		reference.move();
	}
}