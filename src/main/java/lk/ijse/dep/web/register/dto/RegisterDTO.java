package lk.ijse.dep.web.register.dto;

import lk.ijse.dep.web.register.entity.RegisterPK;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO implements Serializable {
    private RegisterPK registerPK;
    private Date registerDate;
    private BigDecimal registerFee;
}
