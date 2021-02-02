package lk.ijse.dep.web.register.business.custom;

import lk.ijse.dep.web.register.business.SuperBO;
import lk.ijse.dep.web.register.dto.CourseDTO;

import java.util.List;

public interface CourseBO extends SuperBO {
    public void saveCourse(CourseDTO courseDTO) throws Exception;

    public void updateCourse(CourseDTO courseDTO) throws Exception;

    public void deleteCourse(String courseCode) throws Exception;

    public List<CourseDTO> findAllCourses() throws Exception;
}
