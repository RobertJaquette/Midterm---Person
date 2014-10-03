package MainPackage;

public class Employee extends Person {
	private String office;
	private Double Salary;
	private String DateHired;
	@Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
		builder.append(Name);
		return builder.toString();
	class Staff extends Employee {
		private String Title;
	}
	class Faculty extends Employee {
		private String officehours;
		private String rank;	
		}
	}
	}

