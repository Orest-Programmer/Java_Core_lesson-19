package ua.lviv.lgs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception, ClassNotFoundException{
		File file = new	File("serializedEmployee.txt");
		Employee em = new Employee("Orest", 1, 300);
		Methods m = new Methods();
		m.writeObjectToFile(file, em);
		System.out.println(m.readObjectFromFile(file));
		
		File file2 = new File("serializedEmployeeCollection.txt");
		List<Employee> listEmployee = new ArrayList<>();
		listEmployee.add(em);
		listEmployee.add(new Employee("Andrew", 2, 1000));
		listEmployee.add(new Employee("Cristy", 4, 1200));
		m.writeObjectToFile(file2, (Serializable) listEmployee);
		System.out.println(m.readObjectFromFile(file2));
	}
	
}
