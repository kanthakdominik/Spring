import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.dominik.repository.HibernateSpeakerRepositoryImpl;
import pl.dominik.repository.SpeakerRepository;
import pl.dominik.service.SpeakerService;
import pl.dominik.service.SpeakerServiceImpl;
import pl.dominik.util.CalendarFactory;

import java.util.Calendar;

@Configuration
@ComponentScan({"pl.dominik"})
public class AppConfig {

    @Bean(name ="cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }
}
