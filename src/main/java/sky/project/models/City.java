package sky.project.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_id;
    private String cityName;
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Employee> employeeList;

    public City(String cityName) {
        this.cityName = cityName;
    }
    public City(int city_id) {
        this.city_id = city_id;
    }
    public City(){};



    public String getCityName() {
        return cityName;
    }
    public int getCityId() {
        return city_id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public void setCityId(int cityId) {
        this.city_id = city_id;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return city_id == city.city_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city_id);
    }

    @Override
    public String toString() {
        return city_id + " " + cityName;
    }
}
