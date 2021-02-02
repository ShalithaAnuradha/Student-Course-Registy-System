package lk.ijse.dep.web.register.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@Data @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "student")
public class Student implements SuperEntity{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;
    @Column(name = "student_name")
    private String studentName;
    private Date dob;
    private String contact;
    private String gender;
    @Embedded
    private Address address;


}
