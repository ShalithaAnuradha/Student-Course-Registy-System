package lk.ijse.dep.web.register.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns =  "/api/v1/course/*" )
public class CourseServlet extends HttpServlet {
    final Logger logger = LoggerFactory.getLogger(CourseServlet.class);




}
