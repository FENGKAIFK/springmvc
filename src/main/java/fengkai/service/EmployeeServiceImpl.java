package fengkai.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fengkai.dao.EmployeeDao;
@Service()
public class EmployeeServiceImpl implements EmployeeService {
	//@Autowired
	@Resource
	EmployeeDao employeeDao;
	@Override
	public List<Object> getAllEmployees() {
		List<Object> lemps = employeeDao.getAllEmployees();
		
		return lemps;
	}

}
