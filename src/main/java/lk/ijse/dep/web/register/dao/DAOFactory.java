package lk.ijse.dep.web.register.dao;

import lk.ijse.dep.web.register.dao.custom.impl.CourseDAOIMPL;
import lk.ijse.dep.web.register.dao.custom.impl.RegisterDAOIMPL;
import lk.ijse.dep.web.register.dao.custom.impl.StudentDAOIMPL;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){

    }

    public static DAOFactory getInstance(){
        return (daoFactory!=null)?daoFactory:(daoFactory=new DAOFactory());
    }

    public <T extends SuperDAO> T getDAO(DAOTypes daoType){
        switch (daoType){
            case STUDENT:
                return (T)  new StudentDAOIMPL();
            case COURSE:
                return (T) new CourseDAOIMPL();
            case REGISTER:
                return (T) new RegisterDAOIMPL();
            default:
                return null;
        }
    }
}
