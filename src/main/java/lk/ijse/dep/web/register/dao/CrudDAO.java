package lk.ijse.dep.web.register.dao;

import lk.ijse.dep.web.register.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;

public interface CrudDAO <T extends SuperEntity, PK extends Serializable> extends SuperDAO{
    void save(T entity) throws Exception;

    void update(T entity) throws Exception;

    void delete(PK key) throws Exception;

    T getById(PK key) throws Exception;

    List<T> getAll() throws Exception;
}
