package fengkai.springmvc;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fengkai.service.EmployeeService;

@Controller
public class EmployeeController {
	
//	@RequestMapping("show")
//	public String getAllEmployees(){
//		EmployeeService emps = new EmployeeServiceImpl();
//		emps.getAllEmployees();
//		
//		return "showEmployee";
//		
//	}
	
	
	@Resource
	//@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String getAllEmployees(Model model)
	{
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "showEmployee";
	}
}
