package Consumer;

import java.util.function.Consumer;

public class Consumer_andThen {

	public static void main(String[] args) {

		Consumer<Employee> eNoConsumer = employee -> {

			System.out.println("Employee number " + employee.eno);
		};

		Consumer<Employee> eNameConsumer = employee -> {

			System.out.println("Employee number " + employee.ename);
		};
		
		Consumer<Employee> chainConsumer = eNoConsumer.andThen(eNameConsumer); // it returning employee type Employee
		
		Employee officer = new Employee(1001, "bablu");
		
		chainConsumer.accept(officer);
	}

}
