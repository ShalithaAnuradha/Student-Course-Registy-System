package lk.ijse.dep.web.register.business.custom;

import lk.ijse.dep.web.register.business.SuperBO;
import lk.ijse.dep.web.register.dto.RegisterDTO;

public interface RegisterBO extends SuperBO {
    public void register(RegisterDTO dto) throws Exception;
}
