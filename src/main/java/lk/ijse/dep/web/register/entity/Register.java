package lk.ijse.dep.web.register.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "register")
public class Register implements SuperEntity{
    @EmbeddedId
    private RegisterPK registerPK;
    @Column(name = "register_date")
    private Date registerDate;
    @Column(name = "register_fee")
    private BigDecimal registerFee;
    @Setter(AccessLevel.NONE)
    @OneToMany
    @JoinColumn(name = "student_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Student student;
    @Setter(AccessLevel.NONE)
    @OneToMany
    @JoinColumn(name = "course_code", referencedColumnName = "code", insertable = false, updatable = false)
    private Course course;

    public Register(RegisterPK registerPK, Date registerDate, BigDecimal registerFee) {
        this.registerPK = registerPK;
        this.registerDate = registerDate;
        this.registerFee = registerFee;
    }

    public Register(String studentId, String courseCode, Date registerDate, BigDecimal registerFee) {
        this.registerPK=new RegisterPK(studentId,courseCode);
        this.registerDate = registerDate;
        this.registerFee = registerFee;
    }
}
