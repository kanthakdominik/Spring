import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.dominik.repository.HibernateSpeakerRepositoryImpl;
import pl.dominik.repository.SpeakerRepository;
import pl.dominik.service.SpeakerService;
import pl.dominik.service.SpeakerServiceImpl;

@Configuration
@ComponentScan({"pl.dominik"})
public class AppConfig {

}
