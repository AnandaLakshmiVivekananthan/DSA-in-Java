package interviewquestions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
class Employee {

	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name='" + name + '\'' +
				", age=" + age;
	}
}

public class InterviewQs {

	public static void main(String[] args) {

		Employee e1 = new Employee("Raj", 30);
		Employee e2 = new Employee("Rajesh", 35);
		Employee e3 = new Employee("Raju", 40);
		Employee e4 = new Employee("Raji", 20);

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		employees.stream().filter(e -> e.age > 30).forEach(e -> System.out.println(e));
	}
}
