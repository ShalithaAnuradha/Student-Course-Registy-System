package lk.ijse.dep.web.register.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ErrorDTO {
    private int status;
    private String error;
    private String message;
}
