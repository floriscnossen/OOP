
public class Person {
	public String name;
	public int age;
	public boolean hasDriversLicence;
	
	public Person() {
		name = "Unknown";
		age = 0;
		hasDriversLicence = false;
	}
	
	public Person(String newName, int newAge, boolean newLicence) {
		name = newName;
		age = newAge;
		hasDriversLicence = newLicence;
	}
	

	public void printName() {
		System.out.println("Name is: " + name);
	}
	
	public void printData() {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Has a drivers licence: " + hasDriversLicence);
	}
	
	public void setData(String newName, int newAge, boolean newLicence) {
		name = newName;
		age = newAge;
		hasDriversLicence = newLicence;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean getLicence() {
		return hasDriversLicence;
	}
}
