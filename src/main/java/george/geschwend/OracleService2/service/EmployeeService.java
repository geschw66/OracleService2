package george.geschwend.OracleService2.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import george.geschwend.OracleService2.DTO.Employee;
import george.geschwend.OracleService2.DTO.GetAllEmployeesResponseWrapper;
import george.geschwend.OracleService2.DTO.GetEmployeeByIdResponseWrapper;
import george.geschwend.OracleService2.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author George C. Geschwend
 * @date 4/30/2023 6:33 PM
 * @project OracleService2
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ObjectMapper employeeObjectMapper;

    public String getAllEmployeesService( ) throws JsonProcessingException {

        List<Employee> employeeArrayList = employeeRepository.findAll();
        GetAllEmployeesResponseWrapper getAllEmployeeResponseWrapper = new GetAllEmployeesResponseWrapper(employeeArrayList);
        String response = employeeObjectMapper.writeValueAsString(getAllEmployeeResponseWrapper);

        return response;

    }

    public ResponseEntity<GetEmployeeByIdResponseWrapper> getEmployeeById(Long id ) throws JsonProcessingException {

        Optional<Employee> employee = employeeRepository.findById(id);

        //String response = employeeObjectMapper.writeValueAsString(employee);
        Optional<GetEmployeeByIdResponseWrapper> response = Optional.of(new GetEmployeeByIdResponseWrapper(employee));

        if (employee.isPresent()) {
            return ResponseEntity.ok(response.get());
        } else {

            return ResponseEntity.notFound().build();
        }

    }
}
