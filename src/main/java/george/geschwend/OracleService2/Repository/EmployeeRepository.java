package george.geschwend.OracleService2.Repository;

import george.geschwend.OracleService2.DTO.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
