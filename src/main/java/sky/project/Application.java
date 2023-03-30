package sky.project;

import sky.project.dao.cityDAO.CityDAO;
import sky.project.dao.cityDAO.CityDAOImpl;
import sky.project.dao.employeeDAO.EmployeeDAO;
import sky.project.dao.employeeDAO.EmployeeDAOImpl;

import java.sql.SQLException;

public class Application {
    private static CityDAO cityDAO = new CityDAOImpl();
    private static EmployeeDAO employeeDAO = new EmployeeDAOImpl();
    public static void main(String[] args) throws SQLException {
//        employeeDAO.addNewEmployee("Katya", "Martynova", "w", 73, 1);
//        System.out.println(employeeDAO.findById(6));
//        System.out.println(employeeDAO.getAllEmployees());
//        employeeDAO.updateEmployee(3, "Alyona", "Martynova", "w", 27, 1);
//        employeeDAO.deleteEmployeeById(4);
    }
}
