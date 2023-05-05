package george.geschwend.OracleService2.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;


import java.util.Date;

/**
 * @author George C. Geschwend
 * @date 4/30/2023 3:50 PM
 * @project OracleService2
 *
 * This is an example entity object (model). it is mapped directly to the database table EMPLOYEE with
 * the schema FRED (high level ...in oracle terms is a "user").
 */

@Data
@ToString
@Entity
@Table(name = "EMPLOYEE", schema= "FRED")
public class Employee {

    @Id                    // Note: use  jakarta.persistence. for all the entity stuff.
    @Column(name = "EMPNO")
    private Long id;

    private String ename;

    private String job;

    private Long mgr;

    private Date hiredate;

    private Long sal;

    private Long comm;

    private Long deptno;

}
