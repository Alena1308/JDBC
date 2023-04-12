package sky.project;

import sky.project.dao.cityDAO.CityDAO;
import sky.project.dao.cityDAO.CityDAOImpl;
import sky.project.dao.employeeDAO.EmployeeDAO;
import sky.project.dao.employeeDAO.EmployeeDAOImpl;
import sky.project.models.Employee;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {
        Employee employee = new Employee("Kyra", "Martynova", "w", 2, 1 );
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        employeeDAO.getAllEmployees().forEach(System.out::println);
        Integer employeeId = employeeDAO.addNewEmployee(employee);
        System.out.println(employeeDAO.getAllEmployees());
        System.out.println(employeeDAO.findById(6));
        employeeDAO.updateEmployee(employee, employeeId);
        employeeDAO.deleteEmployee(employeeDAO.findById(employeeId));
    }
}
