package fengkai.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fengkai.entity.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Object> getAllEmployees() {
		List<Object> lEmp = new ArrayList<>();
		
		Employee a = new Employee("fengkai", "man", 27);
		Employee b = new Employee("siri", "woman", 28);
		Employee c = new Employee("nini", "woman", 25);
		lEmp.add(a);
		lEmp.add(b);
		lEmp.add(c);
		
		return lEmp;
	}

}
