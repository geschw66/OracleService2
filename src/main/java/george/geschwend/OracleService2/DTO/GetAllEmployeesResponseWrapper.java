package george.geschwend.OracleService2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author George C. Geschwend
 * @date 4/30/2023 6:38 PM
 * @project OracleService2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllEmployeesResponseWrapper {

    private List<Employee> getAllEmployeesResponse;

}
