package sky.project.dao.cityDAO;

import sky.project.models.City;

import java.sql.SQLException;

public interface CityDAO {
    City findById(Integer id) throws SQLException;
}
