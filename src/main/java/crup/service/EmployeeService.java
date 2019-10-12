package crup.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import crup.dao.EmployeeDAO;
import crup.model.Employee;

@Path("/employees")
public class EmployeeService {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Employee> getEmployees_JSON(){
		List<Employee> list = EmployeeDAO.getAllEmployees();
		return list;
	}
	
	@GET
	@Path("/{empNo}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Employee getEmployee(@PathParam("empNo") String empNo) {
		Employee emp = EmployeeDAO.getEmployee(empNo);
		return emp;
	}
	
	@POST
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Employee addEmployee(Employee e) {
		return EmployeeDAO.addEmployee(e);
	}
	
	@PUT
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Employee updateEmployee(Employee e) {
		return EmployeeDAO.updateEmployee(e);
	}
	
	@DELETE
	@Path("/{empNo}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void deleteEmployee(@PathParam("empNo") String empNo) {
		EmployeeDAO.deleteEmployee(empNo);
	}
}
