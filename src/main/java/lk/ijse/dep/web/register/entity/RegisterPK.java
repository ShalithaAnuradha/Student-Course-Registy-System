package lk.ijse.dep.web.register.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class RegisterPK implements Serializable{
    @Column(name = "student_id")
    String studentId;
    @Column(name = "course_code")
    String courseCode;

}
