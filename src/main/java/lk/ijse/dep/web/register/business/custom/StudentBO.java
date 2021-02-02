package lk.ijse.dep.web.register.business.custom;

import lk.ijse.dep.web.register.business.SuperBO;
import lk.ijse.dep.web.register.dto.StudentDTO;

import java.util.List;

public interface StudentBO extends SuperBO {
    public void saveStudent(StudentDTO studentDTO) throws Exception;

    public void updateStudent(StudentDTO studentDTO) throws Exception;

    public void deleteStudent(String id) throws Exception;

    public void getStudentById(String id) throws Exception;

//    public void getStudentBy(String detail) throws Exception;

    public List<StudentDTO> findAllStudents() throws Exception;


}
