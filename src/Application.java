
public class Application {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		Person p1 = new Person();
		p1.name = "Floris";
		p1.age = 23;
		p1.hasDriversLicence = true;
		p1.printData();
		String name = p1.getName();
		System.out.println(name);
		
		Person p2 = new Person("Bas", 30, true);
		p2.setData("Baas", 30, true);
		p2.printData();
	}
}
