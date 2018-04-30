package pl.coderslab.day1homework;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		Person[] people = new Person[5];
		people[0] = new Person("z", "z");
		people[1] = new Person("b", "b");
		people[2] = new Person("f", "f");
		people[3] = new Person("x", "x");
		people[4] = new Person("y", "y");

		Arrays.sort(people);

		for (Person person : people) {
			System.out.println(person);
		}

		Person person = new Person("aleks", "tomy");
		System.out.println(people[0].compareTo(people[1]));
		System.out.println(people[4].compareTo(person));
	}

}
