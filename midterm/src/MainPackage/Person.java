package MainPackage;

public class Person {
	private String Name;
	private String Address;
	private String Email;
	private int PhoneNumber;
	@Override
	public String toString() { StringBuilder builder = new StringBuilder();
	builder.append(Name).append(ClassStatus);
	return builder.toString();
class Student extends Person{
	private int ClassStatus;
}
}
}