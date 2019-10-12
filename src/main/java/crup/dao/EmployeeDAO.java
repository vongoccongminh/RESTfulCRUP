package crup.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import crup.model.Employee;

public class EmployeeDAO {

	private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
	
	static{
		initEmps();
	}

	private static void initEmps() {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("E1", "James", "Dev");
		Employee e2 = new Employee("E2", "Messi", "Striker");
		Employee e3 = new Employee("E3", "De Gea", "Goalkeeper");
		
		empMap.put(e1.getEmpNo(), e1);
		empMap.put(e2.getEmpNo(), e2);
		empMap.put(e3.getEmpNo(), e3);
	}
	
	public static Employee getEmployee(String empNo) {
		return empMap.get(empNo);
	}
	
	public static Employee addEmployee(Employee emp) {
		empMap.put(emp.getEmpNo(), emp);
		return emp;
	}
	
	public static Employee updateEmployee(Employee emp) {
		empMap.put(emp.getEmpNo(), emp);
		return emp;
	}
	
	public static void deleteEmployee(String empNo) {
		empMap.remove(empNo);
	}
	
	public static List<Employee> getAllEmployees() {
		Collection<Employee> c = empMap.values();
		List<Employee> list = new ArrayList<Employee>();
		list.addAll(c);
		return list;
	}
	
}
