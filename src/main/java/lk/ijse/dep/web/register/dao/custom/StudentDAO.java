package lk.ijse.dep.web.register.dao.custom;

import lk.ijse.dep.web.register.dao.CrudDAO;
import lk.ijse.dep.web.register.entity.Student;

import javax.persistence.Id;

public interface StudentDAO extends CrudDAO <Student,String>{
    public void getBy(String detail);
}
