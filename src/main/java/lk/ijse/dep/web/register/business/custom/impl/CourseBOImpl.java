package lk.ijse.dep.web.register.business.custom.impl;

import lk.ijse.dep.web.register.business.custom.CourseBO;
import lk.ijse.dep.web.register.dao.custom.CourseDAO;
import lk.ijse.dep.web.register.dto.CourseDTO;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseBOImpl implements CourseBO {

    private final CourseDAO courseDAO;
    private EntityManager em;


    @Override
    public void setEntityManager(EntityManager em) {

    }

    @Override
    public void saveCourse(CourseDTO courseDTO) throws Exception {

    }

    @Override
    public void updateCourse(CourseDTO courseDTO) throws Exception {

    }

    @Override
    public void deleteCourse(String courseCode) throws Exception {

    }

    @Override
    public List<CourseDTO> findAllCourses() throws Exception {
        return null;
    }
}
