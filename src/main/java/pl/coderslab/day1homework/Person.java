package pl.coderslab.day1homework;

public class Person  implements Comparable<Person> {

	public Person (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	String firstName;
	String lastName;

	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "lastName= " + lastName + ", firstName = " + firstName ;
	}


	@Override
	public int compareTo(Person o) {
		char lastChar1 = this.lastName.charAt(lastName.length()-1);
		char lastChar2 = o.lastName.charAt(o.lastName.length()-1);
		if (lastChar1==lastChar2) {
			return 1;
		} else {
			return 0;
		}
	}
}
