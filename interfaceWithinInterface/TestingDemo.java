class TestingDemo
{
	public static void main(String[] args) {
		Testing t = new Testing();
		// t.show();
		Outer.Inner obj;
		obj = t;
		obj.show();

	}
}