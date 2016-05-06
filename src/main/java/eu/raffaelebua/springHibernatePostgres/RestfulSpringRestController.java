package eu.raffaelebua.springHibernatePostgres;


import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


@RestController
public class RestfulSpringRestController {


    @RequestMapping("/user/{firstname}/{lastname}")
    @Secured("ROLE_ADMIN")
    public AppUser user(@PathVariable String firstname,@PathVariable String lastname) {

        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        AppUser user = new AppUser("firstuser");
        session.save(user);

        session.getTransaction().commit();
        session.close();


        return user;
    }

}