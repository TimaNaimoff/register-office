package edu.javacourse.register.config;


import edu.javacourse.register.dao.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:/register.properties")
public class MarriageConfig {
    private static final Logger LOGGER= LoggerFactory.getLogger(MarriageConfig.class);
    @Bean
    public PersonDao buildPerson(){
        LOGGER.info("PersonDao is created!");
        return new PersonDao();
    }
}
