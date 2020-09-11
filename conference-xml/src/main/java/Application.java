import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dominik.service.SpeakerService;
import pl.dominik.service.SpeakerServiceImpl;

public class  Application {

    public static void main(String args[]) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
