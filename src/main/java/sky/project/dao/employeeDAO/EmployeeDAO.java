package sky.project.dao.employeeDAO;

import sky.project.models.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    Employee findById(Integer id) throws SQLException;

    Integer addNewEmployee(Employee employee);

    List<Employee> getAllEmployees();

    void updateEmployee(Employee employee, int id);

    void deleteEmployee(Employee employee);
}
