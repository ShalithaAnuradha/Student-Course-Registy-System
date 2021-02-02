package lk.ijse.dep.web.register.dto;

import lk.ijse.dep.web.register.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embedded;
import java.io.Serializable;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO implements Serializable {

    private String id;
    private String studentName;
    private LocalDate dob;
    private String contact;
    private String gender;
    private String no;
    private String addressLine1;
    private String addressLine2;
    private String city;

}
