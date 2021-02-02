package lk.ijse.dep.web.register.business.util;

import lk.ijse.dep.web.register.dto.StudentDTO;
import lk.ijse.dep.web.register.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Qualifier;
import org.mapstruct.factory.Mappers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.sql.Date;
import java.util.List;

@Mapper
public interface StudentEntityDTOMapper {
    StudentEntityDTOMapper instance = Mappers.getMapper(StudentEntityDTOMapper.class);

    @Mapping(source = ".",target = "dob", qualifiedBy = Address.class)
    Student getStudent(StudentDTO dto);

    default Date toDate(StudentDTO dto){
        return Date.valueOf(dto.getDob());
    }

    StudentDTO getStudentDTO(Student student);

    List<StudentDTO> getStudentDTOs(List<Student> students);


}

@Qualifier
@Target(ElementType.METHOD)
@interface Address{

}
