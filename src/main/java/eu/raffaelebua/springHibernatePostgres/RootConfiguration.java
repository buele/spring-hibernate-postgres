package eu.raffaelebua.springHibernatePostgres;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "eu.raffaelebua.springHibernatePostgres")
public class RootConfiguration {
}