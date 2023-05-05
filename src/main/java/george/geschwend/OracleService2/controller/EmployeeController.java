package george.geschwend.OracleService2.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import george.geschwend.OracleService2.DTO.Employee;
import george.geschwend.OracleService2.DTO.GetEmployeeByIdResponseWrapper;
import george.geschwend.OracleService2.service.EmployeeService;
import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author George C. Geschwend
 * @date 4/30/2023 6:32 PM
 * @project OracleService2
 *
 *  The <code>@RestController</code> is used in order to indicate that this class is a RESTful web
 *  service controller that provides a response in the form of JSON (or XML).
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;

    }

    @GetMapping(path="/getAllEmployees",  produces="application/json")
    public ResponseEntity<String> getAllEmployees() throws JsonProcessingException {

        String response = employeeService.getAllEmployeesService();

        return new ResponseEntity<>(response, HttpStatus.OK);

    }
    @GetMapping(value = "/getEmployeeById/{id}", produces = "application/json")
    public ResponseEntity<GetEmployeeByIdResponseWrapper> getEntityById(@PathVariable Long id) throws JsonProcessingException {

        return employeeService.getEmployeeById(id);
    }

}
