package lk.ijse.dep.web.register.dto;

import lk.ijse.dep.web.register.entity.Audience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
public class CourseDTO implements Serializable {
    private String code;
    private String description;
    private String duration;
    private Audience audience;

}
