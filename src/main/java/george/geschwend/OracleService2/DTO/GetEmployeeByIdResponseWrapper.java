package george.geschwend.OracleService2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

/**
 * @author George C. Geschwend
 * @date 4/30/2023 11:00 PM
 * @project OracleService2
 */

@Data
@NoArgsConstructor
public class GetEmployeeByIdResponseWrapper
{
    private Optional<Employee> getEmployeeByIdResponse;

    public GetEmployeeByIdResponseWrapper(Optional<Employee> employee) {
        this.getEmployeeByIdResponse = employee;
    }
}
