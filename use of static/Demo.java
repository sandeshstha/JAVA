class Demo
{
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.enterToRoom();
		p1.enterToRoom();

		Person p2 = new Person();
		p2.enterToRoom();
		p2.enterToRoom();

		System.out.println(p2.totalCount()); //this must result = 4
		System.out.println(Person.count);

	}
}