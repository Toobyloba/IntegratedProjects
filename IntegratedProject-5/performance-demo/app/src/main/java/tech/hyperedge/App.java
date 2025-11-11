package tech.hyperedge;

public class App {
	public static void main(String[] args) {
		Library1 lib1 = new Library1();
		Library2 lib2 = new Library2();
		Library3 lib3 = new Library3();

		System.out.println("Library1 items: " + lib1.getItems());
		System.out.println("Library2 result: " + lib2.capitalize("hello"));
		System.out.println("Library3 JSON: " + lib3.toJson("message", "success"));
	}
}
